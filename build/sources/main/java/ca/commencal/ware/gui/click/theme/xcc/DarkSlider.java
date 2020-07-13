package ca.commencal.ware.gui.click.theme.xcc;

import ca.commencal.ware.gui.click.base.Component;
import ca.commencal.ware.gui.click.base.ComponentRenderer;
import ca.commencal.ware.gui.click.base.ComponentType;
import ca.commencal.ware.gui.click.elements.Slider;
import ca.commencal.ware.gui.click.theme.Theme;
import ca.commencal.ware.module.modules.render.ClickGui;
import ca.commencal.ware.utils.visual.ColorUtils;
import ca.commencal.ware.utils.visual.GLUtils;
import ca.commencal.ware.utils.visual.RenderUtils;

public class DarkSlider extends ComponentRenderer {

    public DarkSlider(Theme theme) {

        super(ComponentType.SLIDER, theme);
    }

    @Override
    public void drawComponent(Component component, int mouseX, int mouseY) {

        Slider slider = (Slider) component;
        int width = (int) ((slider.getDimension().getWidth()) * slider.getPercent());
        
        int colorStringValueName = ColorUtils.color(0.5f, 0.5f, 0.5f, 1.0f);
        int colorStringValue = ColorUtils.color(1.0f, 1.0f, 1.0f, 1.0f);
        
        int colorSliderRect = ColorUtils.color(1.0f, 1.0f, 1.0f, 1.0f);   
        int colorSlider = ClickGui.color;

        GLUtils.glColor(ColorUtils.color(1.0f, 1.0f, 1.0f, 1.0f));
        
        theme.fontRenderer.drawString(slider.getText(), slider.getX() + 4, slider.getY() + 2, 
        		colorStringValueName);
        
        theme.fontRenderer.drawString(slider.getValue() + "", slider.getX() + slider.getDimension().width - theme.fontRenderer.getStringWidth(slider.getValue() + "") - 2, slider.getY() + 2, 
        		colorStringValue);
        
        RenderUtils.drawRect(slider.getX(), slider.getY() + slider.getDimension().height / 2 + 3, slider.getX() + (width) + 3, (slider.getY() + slider.getDimension().height / 2) + 6, 
        		colorSliderRect);
        
        RenderUtils.drawRect(slider.getX(), slider.getY() + slider.getDimension().height / 2 + 3, slider.getX() + (width), (slider.getY() + slider.getDimension().height / 2) + 6, 
        		colorSlider);
    }

    @Override
    public void doInteractions(Component component, int mouseX, int mouseY) {

    }
}
