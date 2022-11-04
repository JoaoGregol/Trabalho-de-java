import javax.swing.*;
import java.awt.Dimension;
import javax.swing.BorderFactory;

public class Janela extends JFrame {

    private JPanel panel;
    private Lista Lista;

    public Janela(){
        setTitle("Tarefas");
        setSize(450,550);
        setLocation(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Lista = new Lista();
        configJanela();
        setVisible(true);
    }



    private void configJanela() {
        panel = new JPanel();
        GroupLayout JanelaLayout = new GroupLayout(panel);
        JanelaLayout.setAutoCreateGaps(true);
        JanelaLayout.setAutoCreateContainerGaps(true);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(panel);



        JLabel BoxEntrada = new JLabel("Caixa De Tarefas");
        Dimension size = BoxEntrada.getPreferredSize();
        BoxEntrada.setLayout(null);
        BoxEntrada.setBounds(150, 100, size.width, size.height);
        panel.add(BoxEntrada);

        JButton BotaoT = new JButton("NOVA TAREFA");
        panel.add(Box.createVerticalStrut(20));
        panel.add(Box.createHorizontalStrut(190));
        panel.add(BotaoT);

        StringLista();
        add(scrollPane);

        panel.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createCompoundBorder(
                                BorderFactory.createTitledBorder("Tarefas"),
                                BorderFactory.createEmptyBorder(10,10,10,10)),
                        panel.getBorder()));
    }

    private void StringLista(){
        for(String s : Lista.ListaTarefa()){
            panel.add(ItensLista(s));
            panel.add(Box.createVerticalStrut(10));
            panel.add(Box.createHorizontalStrut(30));

        }

    }

    private JPanel ItensLista(String item){
        JPanel panel = new JPanel();
        JLabel label = new JLabel(item);

        JCheckBox CheckBox = new JCheckBox("");
        CheckBox.setSelected(true);
        panel.add(CheckBox);

        panel.setBorder(BorderFactory.createEtchedBorder());
        panel.add(label);
        return panel;


    }

}