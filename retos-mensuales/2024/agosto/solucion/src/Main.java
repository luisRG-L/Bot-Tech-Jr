import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private int vidas = 3;
    private int monedas = 50;
    private int misiones = 0;


    private JLabel vidasL = new JLabel(""+this.vidas);
    private JLabel monedasL = new JLabel(""+this.monedas);
    private JLabel misionesL = new JLabel(""+this.misiones);

    private ImageIcon tipoSuma = new ImageIcon("imagenes/suma.png");
    private ImageIcon tipoResta = new ImageIcon("imagenes/resta.png");

    public Main() {
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Representacion jugador - reto agosto 2024");

        vidasL.setBounds(50, 250, 80, 80);
        vidasL.setFont(new Font("Arial", Font.BOLD, 22));
        add(vidasL);

        JButton sumarVidas = new JButton(tipoSuma);
        sumarVidas.setBounds(50, 190, 80, 80);
        sumarVidas.addActionListener((e) -> {
            this.vidas ++;
            actualizar();
        });
        add(sumarVidas);

        JButton restarVidas = new JButton(tipoResta);
        restarVidas.setBounds(50, 310, 80, 80);
        restarVidas.addActionListener((e) -> {
            this.vidas --;
            actualizar();
        });
        add(restarVidas);

        monedasL.setBounds(500, 250, 80, 80);
        monedasL.setFont(new Font("Arial", Font.BOLD, 22));
        add(monedasL);

        JButton sumarMonedas = new JButton(tipoSuma);
        sumarMonedas.setBounds(500, 190, 80, 80);
        sumarMonedas.addActionListener((e) -> {
            this.monedas ++;
            actualizar();
        });
        add(sumarMonedas);

        JButton restarMonedas = new JButton(tipoResta);
        restarMonedas.setBounds(500, 310, 80, 80);
        restarMonedas.addActionListener((e) -> {
            this.monedas --;
            actualizar();
        });
        add(restarMonedas);

        misionesL.setBounds(1000, 250, 80, 80);
        misionesL.setFont(new Font("Arial", Font.BOLD, 22));
        add(misionesL);

        JButton sumarMisiones = new JButton(tipoSuma);
        sumarMisiones.setBounds(1000, 190, 80, 80);
        sumarMisiones.addActionListener((e) -> {
            this.misiones ++;
            actualizar();
        });
        add(sumarMisiones);

        JButton restarMisiones = new JButton(tipoResta);
        restarMisiones.setBounds(1000, 310, 80, 80);
        restarMisiones.addActionListener((e) -> {
            this.misiones --;
            actualizar();
        });
        add(restarMisiones);

        setVisible(true);
    }

    private void actualizar() {
        if(vidas < 0) {
            vidas = 0;
        }if(monedas < 0) {
            monedas = 0;
        }if(misiones < 0) {
            misiones = 0;
        }
        vidasL.setText(""+vidas);
        monedasL.setText(""+monedas);
        misionesL.setText(""+misiones);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}