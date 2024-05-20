
package controller;

import DAO.BancoDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.Extrato;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

/**
 *
 * @author ryuta
 */
public class ControllerExtrato {
    Extrato extrato;
    private int id;

    public ControllerExtrato(Extrato extrato, int id) {
        this.extrato = extrato;
        this.id = id;
    }
    
    public void mostrarExtrato() {
    Conexao conexao = new Conexao();
    try {
        Connection conn = conexao.getConnection();
        BancoDAO dao = new BancoDAO(conn);
        ResultSet res = dao.MostrarExtrato(id);

        StringBuilder extratoCompleto = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        while (res.next()) {
            Timestamp timestamp = res.getTimestamp("datahora");
            LocalDateTime dateTime = timestamp.toLocalDateTime();
            String formattedDateTime = dateTime.format(formatter);

            String op = res.getString("operacao");
            double valorRealizado = res.getDouble("valor_realizado");
            String moedaRealizado = res.getString("moeda_realizada");
            double cotacao = res.getDouble("cotacao");
            double taxa = res.getDouble("taxa");
            double real = res.getDouble("real");
            double bitcoin = res.getDouble("bitcoin");
            double ethereum = res.getDouble("ethereum");
            double ripple = res.getDouble("ripple");

            String resultado = formattedDateTime + " " +
                               op + " " +
                               valorRealizado + " " +
                               moedaRealizado + " - " +
                               "CT:" + decimalFormat.format(cotacao) + " , " +
                               "TX:" + taxa + " , " +
                               "REAL: " + decimalFormat.format(real) + " , " +
                               "BTC: " + bitcoin + " , " +
                               "ETH:" + ethereum + " , " +
                               "XRP: " + ripple + "\n";

            extratoCompleto.append(resultado);
        }

        if (extratoCompleto.length() > 0) {
            extrato.getTxtExtrato().setText(extratoCompleto.toString());
        } else {
            JOptionPane.showMessageDialog(extrato, "Investidor não encontrado");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(extrato, "Falha de conexão!");
        e.printStackTrace();
    }
}
}
