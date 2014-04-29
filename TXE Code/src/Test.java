import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
public  class Test 
{  
  DefaultMutableTreeNode root, currentNode;  
  int x = 0;  
  public void buildGUI()  
  {  
    root = new DefaultMutableTreeNode(""+x++);  
    final JTree tree = new JTree(root);  
    currentNode = root;  
    JButton btn = new JButton("Add Node");  
    JPanel p = new JPanel();  
    p.add(btn);  
    JSplitPane spt = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,new JScrollPane(tree),p);  
    spt.setResizeWeight(.5);  
    JFrame f = new JFrame();  
    f.getContentPane().add(spt);  
    f.setSize(400,200);  
    f.setLocationRelativeTo(null);  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    f.setVisible(true);  
    btn.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent ae){  
        DefaultMutableTreeNode nextNode = new DefaultMutableTreeNode(""+x++);  
        currentNode.add(nextNode);  
        currentNode = nextNode;  
        tree.scrollPathToVisible(new TreePath(root.getLastLeaf().getPath()));  
      }  
    });  
  }  
  public static void main(String[] args)  
  {  
    SwingUtilities.invokeLater(new Runnable(){  
      public void run(){  
        new Test().buildGUI();  
      }  
    });  
  }  
}  