package com.sX.theme;

import java.awt.Color;

import javax.swing.JComponent;

import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.RoundedBalloonStyle;
import net.java.balloontip.utils.ToolTipUtils;

import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

import com.sX.swing.JxButton;
import com.sX.swing.JxLabel;
import com.sX.swing.JxText;
import com.sX.swing.JxTextA;

public class ThemeUtil {
	
	public void setGeneralTheme(JComponent cmp, Theme theme){
		cmp.setFont(theme.getFont(cmp));
		cmp.setBackground(theme.getBackgroundColor(cmp));
		cmp.setForeground(theme.getForegroundColor(cmp));
	}
	
	public void setTheme(JComponent cmp, Theme theme){
		setGeneralTheme(cmp, theme);
		cmp.setBorder(new CompoundBorderUIResource(theme.getBorder(cmp),new BasicBorders.MarginBorder()));
	}
	
	public void setTheme(JxText cmp, Theme theme){
		setGeneralTheme(cmp, theme);
		cmp.setMargin(theme.getMargin(cmp));
		cmp.setBorder(new CompoundBorderUIResource(theme.getBorder(cmp),new BasicBorders.MarginBorder()));
	}
	
	public void setTheme(JxLabel cmp, Theme theme){
		setGeneralTheme(cmp, theme);
		//cmp.setMargin(theme.getMargin(cmp));
		//cmp.setBorder(new CompoundBorderUIResource(theme.getBorder(cmp),new BasicBorders.MarginBorder()));
	}
	
	public void setTheme(JxTextA cmp, Theme theme){
		setGeneralTheme(cmp, theme);
		//cmp.setMargin(theme.getMargin(cmp));
		//cmp.setBorder(new CompoundBorderUIResource(theme.getBorder(cmp),new BasicBorders.MarginBorder()));
	}
	
	
	
	public void setFontStyle(JComponent cmp,int style){
		cmp.setFont(cmp.getFont().deriveFont(style));
	}
	
	public void setFontSize(JComponent cmp,float size){
		cmp.setFont(cmp.getFont().deriveFont(size));
	}
	
	public void setToolTipText(JComponent cmp, Theme theme, String text, boolean isClose){
		BalloonTipStyle edgedLook = new RoundedBalloonStyle(1,1,new Color(255, 255, 102),Color.BLACK);
		final BalloonTip bt = new BalloonTip(cmp,text,edgedLook,isClose);
		ToolTipUtils.balloonToToolTip(bt, 500, 3000);
	}
	
	
	
	
	

}
