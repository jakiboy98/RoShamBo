package roshambo.view;

import javax.swing.JFrame;
import roshambo.controller.RoShamBoController;

public class RoShamBoFrame
{
	private RoShamBoController baseController;
	private RoShamBoPanel basePanel;
	
	public RoShamBoFrame(RoShamBoController baseController)
	{
		this.baseController = baseController;
		basePanel = new RoShamBoPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); 
		this.setSize(400,400);
		this.setTitle("RoShamBo App!"); 
		this.setResizable(false); 
		this.setVisible(true);
	}
	
	public RoShamBoController getBaseController()
	{
		return baseController;
	}
}
