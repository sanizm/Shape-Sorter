package App;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class UserInterface implements ActionListener {

	private JFrame frame;
	private Panel panel;
	private JButton Load;
	private JButton Sort;
	private ShapeFactory shapeFactory;
	private ArrayList<Shape> shapeList;
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	private Shape semiCircle;
	private Shape oval;
	private Shape yRectangle;
	private int[] localeXArr;
	private int[] localeYArr;
	private InsertionSort insertionSort;
	private Color[] color;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface window = new UserInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("ShapeSorter");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.white);
		frame.getContentPane().setLayout(null);

		CreatePanel();

		// Buttons

		this.Load = new JButton("Load Shapes");
		this.Load.setBounds(168, 5, 115, 25);
		this.Load.setForeground(Color.WHITE);
		this.Load.setFont(new Font("Arial", Font.BOLD, 13));
		this.Load.setBackground(Color.BLACK);
		this.Load.addActionListener(this);
		frame.getContentPane().add(this.Load);

		this.Sort = new JButton("Sort Shapes");
		this.Sort.setBounds(303, 5, 115, 25);
		this.Sort.setForeground(Color.WHITE);
		this.Sort.setBackground(Color.BLACK);
		this.Sort.setFont(new Font("Arial", Font.BOLD, 13));
		this.Sort.addActionListener(this);
		frame.getContentPane().add(this.Sort);

		this.LoadShapes();
		this.panel.setVisible(false);

	}

	private void LoadShapes() {

		// UTITLITY
		this.shapeFactory = new ShapeFactory();
		this.shapeList = new ArrayList<>();
		// Array Initializing
		this.localeXArr = new int[6];
		this.localeYArr = new int[6];

		// Here is the first Shape CIRCLE
		this.circle = this.shapeFactory.getShape("Circle");
		this.shapeList.add(this.circle);
		this.localeXArr[0] = this.circle.getLocaleX();
		this.localeYArr[0] = this.circle.getLocaleY();

		// Here is the second shape RECTANGLE
		this.rectangle = this.shapeFactory.getShape("Rectangle");
		this.shapeList.add(this.rectangle);
		this.localeXArr[1] = this.rectangle.getLocaleX();
		this.localeYArr[1] = this.rectangle.getLocaleY();

		// Here is the third shape SQUARE
		this.square = this.shapeFactory.getShape("Square");
		this.shapeList.add(this.square);
		this.localeXArr[2] = this.square.getLocaleX();
		this.localeYArr[2] = this.square.getLocaleY();

		// Here is the fourth Shape TRIANGLE
		this.semiCircle = this.shapeFactory.getShape("SemiCircle");
		this.shapeList.add(this.semiCircle);
		this.localeXArr[3] = this.semiCircle.getLocaleX();
		this.localeYArr[3] = this.semiCircle.getLocaleY();

		// Here is the fifth Shape OVAL
		this.oval = this.shapeFactory.getShape("Oval");
		this.shapeList.add(this.oval);
		this.localeXArr[4] = this.oval.getLocaleX();
		this.localeYArr[4] = this.oval.getLocaleY();

		// Here is the Sixth Shape YRECTANGLE
		this.yRectangle = this.shapeFactory.getShape("YRectangle");
		this.shapeList.add(this.yRectangle);
		this.localeXArr[5] = this.yRectangle.getLocaleX();
		this.localeYArr[5] = this.yRectangle.getLocaleY();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Load) {
			this.color = null;
			this.panel.setVisible(true);
			CreatePanel();
			this.LoadShapes();
		} else if (e.getSource() == Sort) {
			this.color = new Color[this.shapeList.size()];
			this.insertionSort = InsertionSort.getInstance(localeXArr, localeYArr, shapeList, color);
			this.insertionSort.applied();
			CreatePanel();
		}

	}

	private void CreatePanel() {
		this.panel = new Panel();
		this.panel.setLocation(0, 31);
		this.panel.setSize(596, 540);
		frame.getContentPane().add(this.panel);
		this.panel.setBackground(Color.WHITE);
		this.panel.setLayout(null);
	}

	class Panel extends JPanel {

		private static final long serialVersionUID = 1L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int i = 0;
			for (Shape shape : shapeList)
				if (color == null)
					shape.draw(g, shape.getColor());
				else
					shape.draw(g, color[i++]);
		}

	}

}
