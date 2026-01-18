import javax.swing.*;

class Tabel extends JFrame {
    public Tabel() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // optional but good practice

        String data[][] = {
            {"Sayam", "9867546798", "19"},
            {"Raman", "9868546798", "18"},
            {"Sajan", "9869546798", "39"},
            {"Sanju", "9867546798", "29"},
            {"Rita",  "9867506798", "39"}
        };

        String column[] = {"Name", "Phone Number", "Age"};

        JTable table = new JTable(data, column);
        JScrollPane sp = new JScrollPane(table);
        add(sp); // BorderLayout.CENTER by default
    }

    public static void main(String args[]) {
        new Tabel().setVisible(true);
    }
}
