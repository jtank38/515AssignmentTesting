package hacs;

import javax.swing.*;




/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Zhang ji Zhu Wei
 *@author Jubanjan Dhar
 * @version 2.1
 */

@SuppressWarnings("serial")
abstract public class AssignmentMenu extends JDialog
{
  abstract void ShowMenu(Assignment ass,Person per);
  public AssignmentMenu()
  {
    setModal(true);
    setSize(575,330);
  }
}