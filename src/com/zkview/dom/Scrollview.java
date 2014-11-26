// Generated on Tue Nov 25 18:01:49 CET 2014
// DTD/Schema  :    http://www.zkoss.org/2005/zul

package com.zkview.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.zkoss.org/2005/zul:scrollviewType interface.
 */
public interface Scrollview extends DomElement {

	/**
	 * Returns the value of the simple content.
	 * @return the value of the simple content.
	 */
	@NotNull
	@Required
	String getValue();
	/**
	 * Sets the value of the simple content.
	 * @param value the new value to set
	 */
	void setValue(@NotNull String value);


	/**
	 * Returns the value of the forEach child.
	 * @return the value of the forEach child.
	 */
	@NotNull
	GenericAttributeValue<String> getForEach();


	/**
	 * Returns the value of the forEachBegin child.
	 * @return the value of the forEachBegin child.
	 */
	@NotNull
	GenericAttributeValue<String> getForEachBegin();


	/**
	 * Returns the value of the forEachEnd child.
	 * @return the value of the forEachEnd child.
	 */
	@NotNull
	GenericAttributeValue<String> getForEachEnd();


	/**
	 * Returns the value of the if child.
	 * @return the value of the if child.
	 */
	@NotNull
	GenericAttributeValue<String> getIf();


	/**
	 * Returns the value of the self child.
	 * @return the value of the self child.
	 */
	@NotNull
	GenericAttributeValue<String> getSelf();


	/**
	 * Returns the value of the unless child.
	 * @return the value of the unless child.
	 */
	@NotNull
	GenericAttributeValue<String> getUnless();


	/**
	 * Returns the value of the apply child.
	 * @return the value of the apply child.
	 */
	@NotNull
	GenericAttributeValue<String> getApply();


	/**
	 * Returns the value of the auService child.
	 * @return the value of the auService child.
	 */
	@NotNull
	GenericAttributeValue<String> getAuService();


	/**
	 * Returns the value of the autag child.
	 * @return the value of the autag child.
	 */
	@NotNull
	GenericAttributeValue<String> getAutag();


	/**
	 * Returns the value of the binder child.
	 * @return the value of the binder child.
	 */
	@NotNull
	GenericAttributeValue<String> getBinder();


	/**
	 * Returns the value of the children child.
	 * @return the value of the children child.
	 */
	@NotNull
	GenericAttributeValue<String> getChildren();


	/**
	 * Returns the value of the form child.
	 * @return the value of the form child.
	 */
	@NotNull
	GenericAttributeValue<String> getForm();


	/**
	 * Returns the value of the forward child.
	 * @return the value of the forward child.
	 */
	@NotNull
	GenericAttributeValue<String> getForward();


	/**
	 * Returns the value of the fulfill child.
	 * @return the value of the fulfill child.
	 */
	@NotNull
	GenericAttributeValue<String> getFulfill();


	/**
	 * Returns the value of the id child.
	 * @return the value of the id child.
	 */
	@NotNull
	GenericAttributeValue<String> getId();


	/**
	 * Returns the value of the mold child.
	 * @return the value of the mold child.
	 */
	@NotNull
	GenericAttributeValue<String> getMold();


	/**
	 * Returns the value of the onFulfill child.
	 * @return the value of the onFulfill child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnFulfill();


	/**
	 * Returns the value of the stubonly child.
	 * @return the value of the stubonly child.
	 */
	@NotNull
	GenericAttributeValue<String> getStubonly();


	/**
	 * Returns the value of the use child.
	 * @return the value of the use child.
	 */
	@NotNull
	GenericAttributeValue<String> getUse();


	/**
	 * Returns the value of the viewModel child.
	 * @return the value of the viewModel child.
	 */
	@NotNull
	GenericAttributeValue<String> getViewModel();


	/**
	 * Returns the value of the visible child.
	 * @return the value of the visible child.
	 */
	@NotNull
	GenericAttributeValue<String> getVisible();


	/**
	 * Returns the value of the width child.
	 * @return the value of the width child.
	 */
	@NotNull
	GenericAttributeValue<String> getWidth();


	/**
	 * Returns the value of the height child.
	 * @return the value of the height child.
	 */
	@NotNull
	GenericAttributeValue<String> getHeight();


	/**
	 * Returns the value of the sclass child.
	 * @return the value of the sclass child.
	 */
	@NotNull
	GenericAttributeValue<String> getSclass();


	/**
	 * Returns the value of the zclass child.
	 * @return the value of the zclass child.
	 */
	@NotNull
	GenericAttributeValue<String> getZclass();


	/**
	 * Returns the value of the style child.
	 * @return the value of the style child.
	 */
	@NotNull
	@com.intellij.util.xmlb.annotations.Attribute ("style")
	GenericAttributeValue<String> getStyleAttr();


	/**
	 * Returns the value of the left child.
	 * @return the value of the left child.
	 */
	@NotNull
	GenericAttributeValue<String> getLeft();


	/**
	 * Returns the value of the top child.
	 * @return the value of the top child.
	 */
	@NotNull
	GenericAttributeValue<String> getTop();


	/**
	 * Returns the value of the draggable child.
	 * @return the value of the draggable child.
	 */
	@NotNull
	GenericAttributeValue<String> getDraggable();


	/**
	 * Returns the value of the droppable child.
	 * @return the value of the droppable child.
	 */
	@NotNull
	GenericAttributeValue<String> getDroppable();


	/**
	 * Returns the value of the focus child.
	 * @return the value of the focus child.
	 */
	@NotNull
	GenericAttributeValue<String> getFocus();


	/**
	 * Returns the value of the tooltiptext child.
	 * @return the value of the tooltiptext child.
	 */
	@NotNull
	GenericAttributeValue<String> getTooltiptext();


	/**
	 * Returns the value of the zindex child.
	 * @return the value of the zindex child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getZindex();


	/**
	 * Returns the value of the renderdefer child.
	 * @return the value of the renderdefer child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getRenderdefer();


	/**
	 * Returns the value of the onCreate child.
	 * @return the value of the onCreate child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnCreate();


	/**
	 * Returns the value of the onDrop child.
	 * @return the value of the onDrop child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnDrop();


	/**
	 * Returns the value of the action child.
	 * @return the value of the action child.
	 */
	@NotNull
	GenericAttributeValue<String> getAction();


	/**
	 * Returns the value of the hflex child.
	 * @return the value of the hflex child.
	 */
	@NotNull
	GenericAttributeValue<String> getHflex();


	/**
	 * Returns the value of the vflex child.
	 * @return the value of the vflex child.
	 */
	@NotNull
	GenericAttributeValue<String> getVflex();


	/**
	 * Returns the value of the context child.
	 * @return the value of the context child.
	 */
	@NotNull
	GenericAttributeValue<String> getContext();


	/**
	 * Returns the value of the popup child.
	 * @return the value of the popup child.
	 */
	@NotNull
	@com.intellij.util.xmlb.annotations.Attribute ("popup")
	GenericAttributeValue<String> getPopupAttr();


	/**
	 * Returns the value of the tooltip child.
	 * @return the value of the tooltip child.
	 */
	@NotNull
	GenericAttributeValue<String> getTooltip();


	/**
	 * Returns the value of the onCtrlKey child.
	 * @return the value of the onCtrlKey child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnCtrlKey();


	/**
	 * Returns the value of the ctrlKeys child.
	 * @return the value of the ctrlKeys child.
	 */
	@NotNull
	GenericAttributeValue<String> getCtrlKeys();


	/**
	 * Returns the value of the onBookmarkChange child.
	 * @return the value of the onBookmarkChange child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnBookmarkChange();


	/**
	 * Returns the value of the onClientInfo child.
	 * @return the value of the onClientInfo child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnClientInfo();


	/**
	 * Returns the value of the orient child.
	 * @return the value of the orient child.
	 */
	@NotNull
	GenericAttributeValue<String> getOrient();


	/**
	 * Returns the value of the onScrolling child.
	 * @return the value of the onScrolling child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnScrolling();


	/**
	 * Returns the value of the onScroll child.
	 * @return the value of the onScroll child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnScroll();


	/**
	 * Returns the value of the a child.
	 * @return the value of the a child.
	 */
	@NotNull
	@Required
	A getA();


	/**
	 * Returns the value of the absolutelayout child.
	 * @return the value of the absolutelayout child.
	 */
	@NotNull
	@Required
	Absolutelayout getAbsolutelayout();


	/**
	 * Returns the value of the anchorlayout child.
	 * @return the value of the anchorlayout child.
	 */
	@NotNull
	@Required
	Anchorlayout getAnchorlayout();


	/**
	 * Returns the value of the audio child.
	 * @return the value of the audio child.
	 */
	@NotNull
	@Required
	Audio getAudio();


	/**
	 * Returns the value of the bandbox child.
	 * @return the value of the bandbox child.
	 */
	@NotNull
	@Required
	Bandbox getBandbox();


	/**
	 * Returns the value of the biglistbox child.
	 * @return the value of the biglistbox child.
	 */
	@NotNull
	@Required
	Biglistbox getBiglistbox();


	/**
	 * Returns the value of the borderlayout child.
	 * @return the value of the borderlayout child.
	 */
	@NotNull
	@Required
	Borderlayout getBorderlayout();


	/**
	 * Returns the value of the box child.
	 * @return the value of the box child.
	 */
	@NotNull
	@Required
	Box getBox();


	/**
	 * Returns the value of the button child.
	 * @return the value of the button child.
	 */
	@NotNull
	@Required
	Button getButton();


	/**
	 * Returns the value of the calendar child.
	 * @return the value of the calendar child.
	 */
	@NotNull
	@Required
	Calendar getCalendar();


	/**
	 * Returns the value of the calendars child.
	 * @return the value of the calendars child.
	 */
	@NotNull
	@Required
	Calendars getCalendars();


	/**
	 * Returns the value of the cardlayout child.
	 * @return the value of the cardlayout child.
	 */
	@NotNull
	@Required
	Cardlayout getCardlayout();


	/**
	 * Returns the value of the cell child.
	 * @return the value of the cell child.
	 */
	@NotNull
	@Required
	Cell getCell();


	/**
	 * Returns the value of the chart child.
	 * @return the value of the chart child.
	 */
	@NotNull
	@Required
	Chart getChart();


	/**
	 * Returns the value of the charts child.
	 * @return the value of the charts child.
	 */
	@NotNull
	@Required
	Charts getCharts();


	/**
	 * Returns the value of the checkbox child.
	 * @return the value of the checkbox child.
	 */
	@NotNull
	@Required
	Checkbox getCheckbox();


	/**
	 * Returns the value of the ckeditor child.
	 * @return the value of the ckeditor child.
	 */
	@NotNull
	@Required
	Ckeditor getCkeditor();


	/**
	 * Returns the value of the chosenbox child.
	 * @return the value of the chosenbox child.
	 */
	@NotNull
	@Required
	Chosenbox getChosenbox();


	/**
	 * Returns the value of the colorbox child.
	 * @return the value of the colorbox child.
	 */
	@NotNull
	@Required
	Colorbox getColorbox();


	/**
	 * Returns the value of the columnlayout child.
	 * @return the value of the columnlayout child.
	 */
	@NotNull
	@Required
	Columnlayout getColumnlayout();


	/**
	 * Returns the value of the combobox child.
	 * @return the value of the combobox child.
	 */
	@NotNull
	@Required
	Combobox getCombobox();


	/**
	 * Returns the value of the combobutton child.
	 * @return the value of the combobutton child.
	 */
	@NotNull
	@Required
	Combobutton getCombobutton();


	/**
	 * Returns the value of the datebox child.
	 * @return the value of the datebox child.
	 */
	@NotNull
	@Required
	Datebox getDatebox();


	/**
	 * Returns the value of the decimalbox child.
	 * @return the value of the decimalbox child.
	 */
	@NotNull
	@Required
	Decimalbox getDecimalbox();


	/**
	 * Returns the value of the div child.
	 * @return the value of the div child.
	 */
	@NotNull
	@Required
	Div getDiv();


	/**
	 * Returns the value of the doublebox child.
	 * @return the value of the doublebox child.
	 */
	@NotNull
	@Required
	Doublebox getDoublebox();


	/**
	 * Returns the value of the doublespinner child.
	 * @return the value of the doublespinner child.
	 */
	@NotNull
	@Required
	Doublespinner getDoublespinner();


	/**
	 * Returns the value of the dropupload child.
	 * @return the value of the dropupload child.
	 */
	@NotNull
	@Required
	Dropupload getDropupload();


	/**
	 * Returns the value of the fckeditor child.
	 * @return the value of the fckeditor child.
	 */
	@NotNull
	@Required
	Fckeditor getFckeditor();


	/**
	 * Returns the value of the fisheyebar child.
	 * @return the value of the fisheyebar child.
	 */
	@NotNull
	@Required
	Fisheyebar getFisheyebar();


	/**
	 * Returns the value of the flash child.
	 * @return the value of the flash child.
	 */
	@NotNull
	@Required
	Flash getFlash();


	/**
	 * Returns the value of the flashchart child.
	 * @return the value of the flashchart child.
	 */
	@NotNull
	@Required
	Flashchart getFlashchart();


	/**
	 * Returns the value of the fusionchart child.
	 * @return the value of the fusionchart child.
	 */
	@NotNull
	@Required
	Fusionchart getFusionchart();


	/**
	 * Returns the value of the frozen child.
	 * @return the value of the frozen child.
	 */
	@NotNull
	@Required
	Frozen getFrozen();


	/**
	 * Returns the value of the gmaps child.
	 * @return the value of the gmaps child.
	 */
	@NotNull
	@Required
	Gmaps getGmaps();


	/**
	 * Returns the value of the grid child.
	 * @return the value of the grid child.
	 */
	@NotNull
	@Required
	Grid getGrid();


	/**
	 * Returns the value of the groupbox child.
	 * @return the value of the groupbox child.
	 */
	@NotNull
	@Required
	Groupbox getGroupbox();


	/**
	 * Returns the value of the hbox child.
	 * @return the value of the hbox child.
	 */
	@NotNull
	@Required
	Hbox getHbox();


	/**
	 * Returns the value of the hlayout child.
	 * @return the value of the hlayout child.
	 */
	@NotNull
	@Required
	Hlayout getHlayout();


	/**
	 * Returns the value of the html child.
	 * @return the value of the html child.
	 */
	@NotNull
	@Required
	Html getHtml();


	/**
	 * Returns the value of the idspace child.
	 * @return the value of the idspace child.
	 */
	@NotNull
	@Required
	Idspace getIdspace();


	/**
	 * Returns the value of the iframe child.
	 * @return the value of the iframe child.
	 */
	@NotNull
	@Required
	Iframe getIframe();


	/**
	 * Returns the value of the image child.
	 * @return the value of the image child.
	 */
	@NotNull
	@Required
	Image getImage();


	/**
	 * Returns the value of the imagemap child.
	 * @return the value of the imagemap child.
	 */
	@NotNull
	@Required
	Imagemap getImagemap();


	/**
	 * Returns the value of the include child.
	 * @return the value of the include child.
	 */
	@NotNull
	@Required
	Include getInclude();


	/**
	 * Returns the value of the intbox child.
	 * @return the value of the intbox child.
	 */
	@NotNull
	@Required
	Intbox getIntbox();


	/**
	 * Returns the value of the label child.
	 * @return the value of the label child.
	 */
	@NotNull
	@Required
	Label getLabel();


	/**
	 * Returns the value of the listbox child.
	 * @return the value of the listbox child.
	 */
	@NotNull
	@Required
	Listbox getListbox();


	/**
	 * Returns the value of the longbox child.
	 * @return the value of the longbox child.
	 */
	@NotNull
	@Required
	Longbox getLongbox();


	/**
	 * Returns the value of the menubar child.
	 * @return the value of the menubar child.
	 */
	@NotNull
	@Required
	Menubar getMenubar();


	/**
	 * Returns the value of the menupopup child.
	 * @return the value of the menupopup child.
	 */
	@NotNull
	@Required
	Menupopup getMenupopup();


	/**
	 * Returns the value of the navbar child.
	 * @return the value of the navbar child.
	 */
	@NotNull
	@Required
	Navbar getNavbar();


	/**
	 * Returns the value of the paging child.
	 * @return the value of the paging child.
	 */
	@NotNull
	@Required
	Paging getPaging();


	/**
	 * Returns the value of the panel child.
	 * @return the value of the panel child.
	 */
	@NotNull
	@Required
	Panel getPanel();


	/**
	 * Returns the value of the pivottable child.
	 * @return the value of the pivottable child.
	 */
	@NotNull
	@Required
	Pivottable getPivottable();


	/**
	 * Returns the value of the popup child.
	 * @return the value of the popup child.
	 */
	@NotNull
	@Required
	Popup getPopup();


	/**
	 * Returns the value of the portallayout child.
	 * @return the value of the portallayout child.
	 */
	@NotNull
	@Required
	Portallayout getPortallayout();


	/**
	 * Returns the value of the progressmeter child.
	 * @return the value of the progressmeter child.
	 */
	@NotNull
	@Required
	Progressmeter getProgressmeter();


	/**
	 * Returns the value of the radio child.
	 * @return the value of the radio child.
	 */
	@NotNull
	@Required
	Radio getRadio();


	/**
	 * Returns the value of the radiogroup child.
	 * @return the value of the radiogroup child.
	 */
	@NotNull
	@Required
	Radiogroup getRadiogroup();


	/**
	 * Returns the value of the script child.
	 * @return the value of the script child.
	 */
	@NotNull
	@Required
	Script getScript();


	/**
	 * Returns the value of the scrollview child.
	 * @return the value of the scrollview child.
	 */
	@NotNull
	@Required
	Scrollview getScrollview();


	/**
	 * Returns the value of the selectbox child.
	 * @return the value of the selectbox child.
	 */
	@NotNull
	@Required
	Selectbox getSelectbox();


	/**
	 * Returns the value of the separator child.
	 * @return the value of the separator child.
	 */
	@NotNull
	@Required
	Separator getSeparator();


	/**
	 * Returns the value of the slider child.
	 * @return the value of the slider child.
	 */
	@NotNull
	@Required
	Slider getSlider();


	/**
	 * Returns the value of the space child.
	 * @return the value of the space child.
	 */
	@NotNull
	@Required
	Space getSpace();


	/**
	 * Returns the value of the spinner child.
	 * @return the value of the spinner child.
	 */
	@NotNull
	@Required
	Spinner getSpinner();


	/**
	 * Returns the value of the style child.
	 * @return the value of the style child.
	 */
	@NotNull
	@Required
	Style getStyle();


	/**
	 * Returns the value of the tabbox child.
	 * @return the value of the tabbox child.
	 */
	@NotNull
	@Required
	Tabbox getTabbox();


	/**
	 * Returns the value of the tablelayout child.
	 * @return the value of the tablelayout child.
	 */
	@NotNull
	@Required
	Tablelayout getTablelayout();


	/**
	 * Returns the value of the textbox child.
	 * @return the value of the textbox child.
	 */
	@NotNull
	@Required
	Textbox getTextbox();


	/**
	 * Returns the value of the timer child.
	 * @return the value of the timer child.
	 */
	@NotNull
	@Required
	Timer getTimer();


	/**
	 * Returns the value of the timebox child.
	 * @return the value of the timebox child.
	 */
	@NotNull
	@Required
	Timebox getTimebox();


	/**
	 * Returns the value of the toolbar child.
	 * @return the value of the toolbar child.
	 */
	@NotNull
	@Required
	Toolbar getToolbar();


	/**
	 * Returns the value of the toolbarbutton child.
	 * @return the value of the toolbarbutton child.
	 */
	@NotNull
	@Required
	Toolbarbutton getToolbarbutton();


	/**
	 * Returns the value of the tree child.
	 * @return the value of the tree child.
	 */
	@NotNull
	@Required
	Tree getTree();


	/**
	 * Returns the value of the vbox child.
	 * @return the value of the vbox child.
	 */
	@NotNull
	@Required
	Vbox getVbox();


	/**
	 * Returns the value of the vlayout child.
	 * @return the value of the vlayout child.
	 */
	@NotNull
	@Required
	Vlayout getVlayout();


	/**
	 * Returns the value of the window child.
	 * @return the value of the window child.
	 */
	@NotNull
	@Required
	Window getWindow();


	/**
	 * Returns the value of the zscript child.
	 * @return the value of the zscript child.
	 */
	@NotNull
	@Required
	Zscript getZscript();


	/**
	 * Returns the value of the attribute child.
	 * @return the value of the attribute child.
	 */
	@NotNull
	@Required
	Attribute getAttribute();


	/**
	 * Returns the value of the custom-attributes child.
	 * @return the value of the custom-attributes child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getCustomAttributes();


	/**
	 * Returns the value of the variables child.
	 * @return the value of the variables child.
	 */
	@NotNull
	@Required
	GenericDomValue<String> getVariables();


	/**
	 * Returns the value of the template child.
	 * @return the value of the template child.
	 */
	@NotNull
	@Required
	Template getTemplate();


	/**
	 * Returns the value of the zk child.
	 * @return the value of the zk child.
	 */
	@NotNull
	@Required
	Zk getZk();


}
