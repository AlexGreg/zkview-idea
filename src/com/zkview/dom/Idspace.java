// Generated on Tue Nov 25 18:01:49 CET 2014
// DTD/Schema  :    http://www.zkoss.org/2005/zul

package com.zkview.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.zkoss.org/2005/zul:idspaceType interface.
 */
public interface Idspace extends DomElement {

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
	GenericAttributeValue<String> getStyle();


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
	GenericAttributeValue<String> getPopup();


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
	 * Returns the value of the onClick child.
	 * @return the value of the onClick child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnClick();


	/**
	 * Returns the value of the onRightClick child.
	 * @return the value of the onRightClick child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnRightClick();


	/**
	 * Returns the value of the onDoubleClick child.
	 * @return the value of the onDoubleClick child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnDoubleClick();


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
	 * Returns the list of a children.
	 * @return the list of a children.
	 */
	@NotNull
	List<A> getAs();
	/**
	 * Adds new child to the list of a children.
	 * @return created child
	 */
	A addA();


	/**
	 * Returns the list of absolutelayout children.
	 * @return the list of absolutelayout children.
	 */
	@NotNull
	List<Absolutelayout> getAbsolutelayouts();
	/**
	 * Adds new child to the list of absolutelayout children.
	 * @return created child
	 */
	Absolutelayout addAbsolutelayout();


	/**
	 * Returns the list of anchorlayout children.
	 * @return the list of anchorlayout children.
	 */
	@NotNull
	List<Anchorlayout> getAnchorlayouts();
	/**
	 * Adds new child to the list of anchorlayout children.
	 * @return created child
	 */
	Anchorlayout addAnchorlayout();


	/**
	 * Returns the list of audio children.
	 * @return the list of audio children.
	 */
	@NotNull
	List<Audio> getAudios();
	/**
	 * Adds new child to the list of audio children.
	 * @return created child
	 */
	Audio addAudio();


	/**
	 * Returns the list of bandbox children.
	 * @return the list of bandbox children.
	 */
	@NotNull
	List<Bandbox> getBandboxes();
	/**
	 * Adds new child to the list of bandbox children.
	 * @return created child
	 */
	Bandbox addBandbox();


	/**
	 * Returns the list of biglistbox children.
	 * @return the list of biglistbox children.
	 */
	@NotNull
	List<Biglistbox> getBiglistboxes();
	/**
	 * Adds new child to the list of biglistbox children.
	 * @return created child
	 */
	Biglistbox addBiglistbox();


	/**
	 * Returns the list of borderlayout children.
	 * @return the list of borderlayout children.
	 */
	@NotNull
	List<Borderlayout> getBorderlayouts();
	/**
	 * Adds new child to the list of borderlayout children.
	 * @return created child
	 */
	Borderlayout addBorderlayout();


	/**
	 * Returns the list of box children.
	 * @return the list of box children.
	 */
	@NotNull
	List<Box> getBoxes();
	/**
	 * Adds new child to the list of box children.
	 * @return created child
	 */
	Box addBox();


	/**
	 * Returns the list of button children.
	 * @return the list of button children.
	 */
	@NotNull
	List<Button> getButtons();
	/**
	 * Adds new child to the list of button children.
	 * @return created child
	 */
	Button addButton();


	/**
	 * Returns the list of calendar children.
	 * @return the list of calendar children.
	 */
	@NotNull
	List<Calendar> getCalendars();
	/**
	 * Adds new child to the list of calendar children.
	 * @return created child
	 */
	Calendar addCalendar();


	/**
	 * Returns the list of calendars children.
	 * @return the list of calendars children.
	 */
	@NotNull
	List<Calendars> getCalendarses();
	/**
	 * Adds new child to the list of calendars children.
	 * @return created child
	 */
	Calendars addCalendars();


	/**
	 * Returns the list of cardlayout children.
	 * @return the list of cardlayout children.
	 */
	@NotNull
	List<Cardlayout> getCardlayouts();
	/**
	 * Adds new child to the list of cardlayout children.
	 * @return created child
	 */
	Cardlayout addCardlayout();


	/**
	 * Returns the list of cell children.
	 * @return the list of cell children.
	 */
	@NotNull
	List<Cell> getCells();
	/**
	 * Adds new child to the list of cell children.
	 * @return created child
	 */
	Cell addCell();


	/**
	 * Returns the list of chart children.
	 * @return the list of chart children.
	 */
	@NotNull
	List<Chart> getCharts();
	/**
	 * Adds new child to the list of chart children.
	 * @return created child
	 */
	Chart addChart();


	/**
	 * Returns the list of charts children.
	 * @return the list of charts children.
	 */
	@NotNull
	List<Charts> getChartses();
	/**
	 * Adds new child to the list of charts children.
	 * @return created child
	 */
	Charts addCharts();


	/**
	 * Returns the list of checkbox children.
	 * @return the list of checkbox children.
	 */
	@NotNull
	List<Checkbox> getCheckboxes();
	/**
	 * Adds new child to the list of checkbox children.
	 * @return created child
	 */
	Checkbox addCheckbox();


	/**
	 * Returns the list of ckeditor children.
	 * @return the list of ckeditor children.
	 */
	@NotNull
	List<Ckeditor> getCkeditors();
	/**
	 * Adds new child to the list of ckeditor children.
	 * @return created child
	 */
	Ckeditor addCkeditor();


	/**
	 * Returns the list of chosenbox children.
	 * @return the list of chosenbox children.
	 */
	@NotNull
	List<Chosenbox> getChosenboxes();
	/**
	 * Adds new child to the list of chosenbox children.
	 * @return created child
	 */
	Chosenbox addChosenbox();


	/**
	 * Returns the list of colorbox children.
	 * @return the list of colorbox children.
	 */
	@NotNull
	List<Colorbox> getColorboxes();
	/**
	 * Adds new child to the list of colorbox children.
	 * @return created child
	 */
	Colorbox addColorbox();


	/**
	 * Returns the list of columnlayout children.
	 * @return the list of columnlayout children.
	 */
	@NotNull
	List<Columnlayout> getColumnlayouts();
	/**
	 * Adds new child to the list of columnlayout children.
	 * @return created child
	 */
	Columnlayout addColumnlayout();


	/**
	 * Returns the list of combobox children.
	 * @return the list of combobox children.
	 */
	@NotNull
	List<Combobox> getComboboxes();
	/**
	 * Adds new child to the list of combobox children.
	 * @return created child
	 */
	Combobox addCombobox();


	/**
	 * Returns the list of combobutton children.
	 * @return the list of combobutton children.
	 */
	@NotNull
	List<Combobutton> getCombobuttons();
	/**
	 * Adds new child to the list of combobutton children.
	 * @return created child
	 */
	Combobutton addCombobutton();


	/**
	 * Returns the list of datebox children.
	 * @return the list of datebox children.
	 */
	@NotNull
	List<Datebox> getDateboxes();
	/**
	 * Adds new child to the list of datebox children.
	 * @return created child
	 */
	Datebox addDatebox();


	/**
	 * Returns the list of decimalbox children.
	 * @return the list of decimalbox children.
	 */
	@NotNull
	List<Decimalbox> getDecimalboxes();
	/**
	 * Adds new child to the list of decimalbox children.
	 * @return created child
	 */
	Decimalbox addDecimalbox();


	/**
	 * Returns the list of div children.
	 * @return the list of div children.
	 */
	@NotNull
	List<Div> getDivs();
	/**
	 * Adds new child to the list of div children.
	 * @return created child
	 */
	Div addDiv();


	/**
	 * Returns the list of doublebox children.
	 * @return the list of doublebox children.
	 */
	@NotNull
	List<Doublebox> getDoubleboxes();
	/**
	 * Adds new child to the list of doublebox children.
	 * @return created child
	 */
	Doublebox addDoublebox();


	/**
	 * Returns the list of doublespinner children.
	 * @return the list of doublespinner children.
	 */
	@NotNull
	List<Doublespinner> getDoublespinners();
	/**
	 * Adds new child to the list of doublespinner children.
	 * @return created child
	 */
	Doublespinner addDoublespinner();


	/**
	 * Returns the list of dropupload children.
	 * @return the list of dropupload children.
	 */
	@NotNull
	List<Dropupload> getDropuploads();
	/**
	 * Adds new child to the list of dropupload children.
	 * @return created child
	 */
	Dropupload addDropupload();


	/**
	 * Returns the list of fckeditor children.
	 * @return the list of fckeditor children.
	 */
	@NotNull
	List<Fckeditor> getFckeditors();
	/**
	 * Adds new child to the list of fckeditor children.
	 * @return created child
	 */
	Fckeditor addFckeditor();


	/**
	 * Returns the list of fisheyebar children.
	 * @return the list of fisheyebar children.
	 */
	@NotNull
	List<Fisheyebar> getFisheyebars();
	/**
	 * Adds new child to the list of fisheyebar children.
	 * @return created child
	 */
	Fisheyebar addFisheyebar();


	/**
	 * Returns the list of flash children.
	 * @return the list of flash children.
	 */
	@NotNull
	List<Flash> getFlashs();
	/**
	 * Adds new child to the list of flash children.
	 * @return created child
	 */
	Flash addFlash();


	/**
	 * Returns the list of flashchart children.
	 * @return the list of flashchart children.
	 */
	@NotNull
	List<Flashchart> getFlashcharts();
	/**
	 * Adds new child to the list of flashchart children.
	 * @return created child
	 */
	Flashchart addFlashchart();


	/**
	 * Returns the list of fusionchart children.
	 * @return the list of fusionchart children.
	 */
	@NotNull
	List<Fusionchart> getFusioncharts();
	/**
	 * Adds new child to the list of fusionchart children.
	 * @return created child
	 */
	Fusionchart addFusionchart();


	/**
	 * Returns the list of frozen children.
	 * @return the list of frozen children.
	 */
	@NotNull
	List<Frozen> getFrozens();
	/**
	 * Adds new child to the list of frozen children.
	 * @return created child
	 */
	Frozen addFrozen();


	/**
	 * Returns the list of gmaps children.
	 * @return the list of gmaps children.
	 */
	@NotNull
	List<Gmaps> getGmapses();
	/**
	 * Adds new child to the list of gmaps children.
	 * @return created child
	 */
	Gmaps addGmaps();


	/**
	 * Returns the list of grid children.
	 * @return the list of grid children.
	 */
	@NotNull
	List<Grid> getGrids();
	/**
	 * Adds new child to the list of grid children.
	 * @return created child
	 */
	Grid addGrid();


	/**
	 * Returns the list of groupbox children.
	 * @return the list of groupbox children.
	 */
	@NotNull
	List<Groupbox> getGroupboxes();
	/**
	 * Adds new child to the list of groupbox children.
	 * @return created child
	 */
	Groupbox addGroupbox();


	/**
	 * Returns the list of hbox children.
	 * @return the list of hbox children.
	 */
	@NotNull
	List<Hbox> getHboxes();
	/**
	 * Adds new child to the list of hbox children.
	 * @return created child
	 */
	Hbox addHbox();


	/**
	 * Returns the list of hlayout children.
	 * @return the list of hlayout children.
	 */
	@NotNull
	List<Hlayout> getHlayouts();
	/**
	 * Adds new child to the list of hlayout children.
	 * @return created child
	 */
	Hlayout addHlayout();


	/**
	 * Returns the list of html children.
	 * @return the list of html children.
	 */
	@NotNull
	List<Html> getHtmls();
	/**
	 * Adds new child to the list of html children.
	 * @return created child
	 */
	Html addHtml();


	/**
	 * Returns the list of idspace children.
	 * @return the list of idspace children.
	 */
	@NotNull
	List<Idspace> getIdspaces();
	/**
	 * Adds new child to the list of idspace children.
	 * @return created child
	 */
	Idspace addIdspace();


	/**
	 * Returns the list of iframe children.
	 * @return the list of iframe children.
	 */
	@NotNull
	List<Iframe> getIframes();
	/**
	 * Adds new child to the list of iframe children.
	 * @return created child
	 */
	Iframe addIframe();


	/**
	 * Returns the list of image children.
	 * @return the list of image children.
	 */
	@NotNull
	List<Image> getImages();
	/**
	 * Adds new child to the list of image children.
	 * @return created child
	 */
	Image addImage();


	/**
	 * Returns the list of imagemap children.
	 * @return the list of imagemap children.
	 */
	@NotNull
	List<Imagemap> getImagemaps();
	/**
	 * Adds new child to the list of imagemap children.
	 * @return created child
	 */
	Imagemap addImagemap();


	/**
	 * Returns the list of include children.
	 * @return the list of include children.
	 */
	@NotNull
	List<Include> getIncludes();
	/**
	 * Adds new child to the list of include children.
	 * @return created child
	 */
	Include addInclude();


	/**
	 * Returns the list of intbox children.
	 * @return the list of intbox children.
	 */
	@NotNull
	List<Intbox> getIntboxes();
	/**
	 * Adds new child to the list of intbox children.
	 * @return created child
	 */
	Intbox addIntbox();


	/**
	 * Returns the list of label children.
	 * @return the list of label children.
	 */
	@NotNull
	List<Label> getLabels();
	/**
	 * Adds new child to the list of label children.
	 * @return created child
	 */
	Label addLabel();


	/**
	 * Returns the list of listbox children.
	 * @return the list of listbox children.
	 */
	@NotNull
	List<Listbox> getListboxes();
	/**
	 * Adds new child to the list of listbox children.
	 * @return created child
	 */
	Listbox addListbox();


	/**
	 * Returns the list of longbox children.
	 * @return the list of longbox children.
	 */
	@NotNull
	List<Longbox> getLongboxes();
	/**
	 * Adds new child to the list of longbox children.
	 * @return created child
	 */
	Longbox addLongbox();


	/**
	 * Returns the list of menubar children.
	 * @return the list of menubar children.
	 */
	@NotNull
	List<Menubar> getMenubars();
	/**
	 * Adds new child to the list of menubar children.
	 * @return created child
	 */
	Menubar addMenubar();


	/**
	 * Returns the list of menupopup children.
	 * @return the list of menupopup children.
	 */
	@NotNull
	List<Menupopup> getMenupopups();
	/**
	 * Adds new child to the list of menupopup children.
	 * @return created child
	 */
	Menupopup addMenupopup();


	/**
	 * Returns the list of navbar children.
	 * @return the list of navbar children.
	 */
	@NotNull
	List<Navbar> getNavbars();
	/**
	 * Adds new child to the list of navbar children.
	 * @return created child
	 */
	Navbar addNavbar();


	/**
	 * Returns the list of paging children.
	 * @return the list of paging children.
	 */
	@NotNull
	List<Paging> getPagings();
	/**
	 * Adds new child to the list of paging children.
	 * @return created child
	 */
	Paging addPaging();


	/**
	 * Returns the list of panel children.
	 * @return the list of panel children.
	 */
	@NotNull
	List<Panel> getPanels();
	/**
	 * Adds new child to the list of panel children.
	 * @return created child
	 */
	Panel addPanel();


	/**
	 * Returns the list of pivottable children.
	 * @return the list of pivottable children.
	 */
	@NotNull
	List<Pivottable> getPivottables();
	/**
	 * Adds new child to the list of pivottable children.
	 * @return created child
	 */
	Pivottable addPivottable();


	/**
	 * Returns the list of popup children.
	 * @return the list of popup children.
	 */
	@NotNull
	List<Popup> getPopups();
	/**
	 * Adds new child to the list of popup children.
	 * @return created child
	 */
	Popup addPopup();


	/**
	 * Returns the list of portallayout children.
	 * @return the list of portallayout children.
	 */
	@NotNull
	List<Portallayout> getPortallayouts();
	/**
	 * Adds new child to the list of portallayout children.
	 * @return created child
	 */
	Portallayout addPortallayout();


	/**
	 * Returns the list of progressmeter children.
	 * @return the list of progressmeter children.
	 */
	@NotNull
	List<Progressmeter> getProgressmeters();
	/**
	 * Adds new child to the list of progressmeter children.
	 * @return created child
	 */
	Progressmeter addProgressmeter();


	/**
	 * Returns the list of radio children.
	 * @return the list of radio children.
	 */
	@NotNull
	List<Radio> getRadios();
	/**
	 * Adds new child to the list of radio children.
	 * @return created child
	 */
	Radio addRadio();


	/**
	 * Returns the list of radiogroup children.
	 * @return the list of radiogroup children.
	 */
	@NotNull
	List<Radiogroup> getRadiogroups();
	/**
	 * Adds new child to the list of radiogroup children.
	 * @return created child
	 */
	Radiogroup addRadiogroup();


	/**
	 * Returns the list of script children.
	 * @return the list of script children.
	 */
	@NotNull
	List<Script> getScripts();
	/**
	 * Adds new child to the list of script children.
	 * @return created child
	 */
	Script addScript();


	/**
	 * Returns the list of scrollview children.
	 * @return the list of scrollview children.
	 */
	@NotNull
	List<Scrollview> getScrollviews();
	/**
	 * Adds new child to the list of scrollview children.
	 * @return created child
	 */
	Scrollview addScrollview();


	/**
	 * Returns the list of selectbox children.
	 * @return the list of selectbox children.
	 */
	@NotNull
	List<Selectbox> getSelectboxes();
	/**
	 * Adds new child to the list of selectbox children.
	 * @return created child
	 */
	Selectbox addSelectbox();


	/**
	 * Returns the list of separator children.
	 * @return the list of separator children.
	 */
	@NotNull
	List<Separator> getSeparators();
	/**
	 * Adds new child to the list of separator children.
	 * @return created child
	 */
	Separator addSeparator();


	/**
	 * Returns the list of slider children.
	 * @return the list of slider children.
	 */
	@NotNull
	List<Slider> getSliders();
	/**
	 * Adds new child to the list of slider children.
	 * @return created child
	 */
	Slider addSlider();


	/**
	 * Returns the list of space children.
	 * @return the list of space children.
	 */
	@NotNull
	List<Space> getSpaces();
	/**
	 * Adds new child to the list of space children.
	 * @return created child
	 */
	Space addSpace();


	/**
	 * Returns the list of spinner children.
	 * @return the list of spinner children.
	 */
	@NotNull
	List<Spinner> getSpinners();
	/**
	 * Adds new child to the list of spinner children.
	 * @return created child
	 */
	Spinner addSpinner();


	/**
	 * Returns the list of style children.
	 * @return the list of style children.
	 */
	@NotNull
	List<Style> getStyles();
	/**
	 * Adds new child to the list of style children.
	 * @return created child
	 */
	Style addStyle();


	/**
	 * Returns the list of tabbox children.
	 * @return the list of tabbox children.
	 */
	@NotNull
	List<Tabbox> getTabboxes();
	/**
	 * Adds new child to the list of tabbox children.
	 * @return created child
	 */
	Tabbox addTabbox();


	/**
	 * Returns the list of tablelayout children.
	 * @return the list of tablelayout children.
	 */
	@NotNull
	List<Tablelayout> getTablelayouts();
	/**
	 * Adds new child to the list of tablelayout children.
	 * @return created child
	 */
	Tablelayout addTablelayout();


	/**
	 * Returns the list of textbox children.
	 * @return the list of textbox children.
	 */
	@NotNull
	List<Textbox> getTextboxes();
	/**
	 * Adds new child to the list of textbox children.
	 * @return created child
	 */
	Textbox addTextbox();


	/**
	 * Returns the list of timer children.
	 * @return the list of timer children.
	 */
	@NotNull
	List<Timer> getTimers();
	/**
	 * Adds new child to the list of timer children.
	 * @return created child
	 */
	Timer addTimer();


	/**
	 * Returns the list of timebox children.
	 * @return the list of timebox children.
	 */
	@NotNull
	List<Timebox> getTimeboxes();
	/**
	 * Adds new child to the list of timebox children.
	 * @return created child
	 */
	Timebox addTimebox();


	/**
	 * Returns the list of toolbar children.
	 * @return the list of toolbar children.
	 */
	@NotNull
	List<Toolbar> getToolbars();
	/**
	 * Adds new child to the list of toolbar children.
	 * @return created child
	 */
	Toolbar addToolbar();


	/**
	 * Returns the list of toolbarbutton children.
	 * @return the list of toolbarbutton children.
	 */
	@NotNull
	List<Toolbarbutton> getToolbarbuttons();
	/**
	 * Adds new child to the list of toolbarbutton children.
	 * @return created child
	 */
	Toolbarbutton addToolbarbutton();


	/**
	 * Returns the list of tree children.
	 * @return the list of tree children.
	 */
	@NotNull
	List<Tree> getTrees();
	/**
	 * Adds new child to the list of tree children.
	 * @return created child
	 */
	Tree addTree();


	/**
	 * Returns the list of vbox children.
	 * @return the list of vbox children.
	 */
	@NotNull
	List<Vbox> getVboxes();
	/**
	 * Adds new child to the list of vbox children.
	 * @return created child
	 */
	Vbox addVbox();


	/**
	 * Returns the list of vlayout children.
	 * @return the list of vlayout children.
	 */
	@NotNull
	List<Vlayout> getVlayouts();
	/**
	 * Adds new child to the list of vlayout children.
	 * @return created child
	 */
	Vlayout addVlayout();


	/**
	 * Returns the list of window children.
	 * @return the list of window children.
	 */
	@NotNull
	List<Window> getWindows();
	/**
	 * Adds new child to the list of window children.
	 * @return created child
	 */
	Window addWindow();


	/**
	 * Returns the list of zscript children.
	 * @return the list of zscript children.
	 */
	@NotNull
	List<Zscript> getZscripts();
	/**
	 * Adds new child to the list of zscript children.
	 * @return created child
	 */
	Zscript addZscript();


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
