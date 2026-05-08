package chapter13Exe;
	import java.awt.*;
	import java.awt.Event.*;
	import javax.swing.*;

	public class NotePad extends JFrame {
	    JMenuBar mb;
	    JMenu file, edit;

	    JMenuItem newItem, openItem, exitItem;
	
	    JMenuItem cutItem, copyItem, pasteItem;
	    
	    JTextArea txt;
	    JScrollPane sp;

	    public NotePad() {

	        mb = new JMenuBar();
	        file = new JMenu("File");
	        edit = new JMenu("Edit");

	        newItem = new JMenuItem("New");
	        openItem = new JMenuItem("Open");
	        exitItem = new JMenuItem("Exit");


	        cutItem = new JMenuItem("Cut");
	        copyItem = new JMenuItem("Copy");
	        pasteItem = new JMenuItem("Paste");

	        this.setJMenuBar(mb);

	        mb.add(file);
	        mb.add(edit);

	        file.add(newItem);
	        file.add(openItem);
	        file.addSeparator(); 
	        file.add(exitItem);

	        edit.add(cutItem);
	        edit.add(copyItem);
	        edit.add(pasteItem);

	        txt = new JTextArea(20, 30);
	        sp = new JScrollPane(txt);
	        
	        Container c = this.getContentPane();
	        c.add(sp);

	        this.setTitle("Notepad");
	        this.setSize(500, 300);
	        this.setLocation(100, 100);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setVisible(true);
	    }

	    public static void main(String args[]) {
	        new NotePad();
	    }
	}

