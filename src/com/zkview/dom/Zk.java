// Generated on Tue Nov 25 18:01:49 CET 2014
// DTD/Schema  :    http://www.zkoss.org/2005/zul

package com.zkview.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.zkoss.org/2005/zul:zkType interface.
 */
public interface Zk extends DomElement {

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
	 * Returns the value of the switch child.
	 * @return the value of the switch child.
	 */
	@NotNull
	GenericAttributeValue<String> getSwitch();


	/**
	 * Returns the value of the case child.
	 * @return the value of the case child.
	 */
	@NotNull
	GenericAttributeValue<String> getCase();


	/**
	 * Returns the value of the choose child.
	 * @return the value of the choose child.
	 */
	@NotNull
	GenericAttributeValue<String> getChoose();


	/**
	 * Returns the value of the when child.
	 * @return the value of the when child.
	 */
	@NotNull
	GenericAttributeValue<String> getWhen();


	/**
	 * Returns the list of area children.
	 * @return the list of area children.
	 */
	@NotNull
	List<Area> getAreas();
	/**
	 * Adds new child to the list of area children.
	 * @return created child
	 */
	Area addArea();


	/**
	 * Returns the list of bandpopup children.
	 * @return the list of bandpopup children.
	 */
	@NotNull
	List<Bandpopup> getBandpopups();
	/**
	 * Adds new child to the list of bandpopup children.
	 * @return created child
	 */
	Bandpopup addBandpopup();


	/**
	 * Returns the list of caption children.
	 * @return the list of caption children.
	 */
	@NotNull
	List<Caption> getCaptions();
	/**
	 * Adds new child to the list of caption children.
	 * @return created child
	 */
	Caption addCaption();


	/**
	 * Returns the list of center children.
	 * @return the list of center children.
	 */
	@NotNull
	List<Center> getCenters();
	/**
	 * Adds new child to the list of center children.
	 * @return created child
	 */
	Center addCenter();


	/**
	 * Returns the list of columns children.
	 * @return the list of columns children.
	 */
	@NotNull
	List<Columns> getColumnses();
	/**
	 * Adds new child to the list of columns children.
	 * @return created child
	 */
	Columns addColumns();


	/**
	 * Returns the list of column children.
	 * @return the list of column children.
	 */
	@NotNull
	List<Column> getColumns();
	/**
	 * Adds new child to the list of column children.
	 * @return created child
	 */
	Column addColumn();


	/**
	 * Returns the list of comboitem children.
	 * @return the list of comboitem children.
	 */
	@NotNull
	List<Comboitem> getComboitems();
	/**
	 * Adds new child to the list of comboitem children.
	 * @return created child
	 */
	Comboitem addComboitem();


	/**
	 * Returns the list of detail children.
	 * @return the list of detail children.
	 */
	@NotNull
	List<Detail> getDetails();
	/**
	 * Adds new child to the list of detail children.
	 * @return created child
	 */
	Detail addDetail();


	/**
	 * Returns the list of east children.
	 * @return the list of east children.
	 */
	@NotNull
	List<East> getEasts();
	/**
	 * Adds new child to the list of east children.
	 * @return created child
	 */
	East addEast();


	/**
	 * Returns the list of fisheye children.
	 * @return the list of fisheye children.
	 */
	@NotNull
	List<Fisheye> getFisheyes();
	/**
	 * Adds new child to the list of fisheye children.
	 * @return created child
	 */
	Fisheye addFisheye();


	/**
	 * Returns the list of foot children.
	 * @return the list of foot children.
	 */
	@NotNull
	List<Foot> getFoots();
	/**
	 * Adds new child to the list of foot children.
	 * @return created child
	 */
	Foot addFoot();


	/**
	 * Returns the list of footer children.
	 * @return the list of footer children.
	 */
	@NotNull
	List<Footer> getFooters();
	/**
	 * Adds new child to the list of footer children.
	 * @return created child
	 */
	Footer addFooter();


	/**
	 * Returns the list of ginfo children.
	 * @return the list of ginfo children.
	 */
	@NotNull
	List<Ginfo> getGinfos();
	/**
	 * Adds new child to the list of ginfo children.
	 * @return created child
	 */
	Ginfo addGinfo();


	/**
	 * Returns the list of gmarker children.
	 * @return the list of gmarker children.
	 */
	@NotNull
	List<Gmarker> getGmarkers();
	/**
	 * Adds new child to the list of gmarker children.
	 * @return created child
	 */
	Gmarker addGmarker();


	/**
	 * Returns the list of group children.
	 * @return the list of group children.
	 */
	@NotNull
	List<Group> getGroups();
	/**
	 * Adds new child to the list of group children.
	 * @return created child
	 */
	Group addGroup();


	/**
	 * Returns the list of groupfoot children.
	 * @return the list of groupfoot children.
	 */
	@NotNull
	List<Groupfoot> getGroupfoots();
	/**
	 * Adds new child to the list of groupfoot children.
	 * @return created child
	 */
	Groupfoot addGroupfoot();


	/**
	 * Returns the list of listcell children.
	 * @return the list of listcell children.
	 */
	@NotNull
	List<Listcell> getListcells();
	/**
	 * Adds new child to the list of listcell children.
	 * @return created child
	 */
	Listcell addListcell();


	/**
	 * Returns the list of listfoot children.
	 * @return the list of listfoot children.
	 */
	@NotNull
	List<Listfoot> getListfoots();
	/**
	 * Adds new child to the list of listfoot children.
	 * @return created child
	 */
	Listfoot addListfoot();


	/**
	 * Returns the list of listfooter children.
	 * @return the list of listfooter children.
	 */
	@NotNull
	List<Listfooter> getListfooters();
	/**
	 * Adds new child to the list of listfooter children.
	 * @return created child
	 */
	Listfooter addListfooter();


	/**
	 * Returns the list of listgroup children.
	 * @return the list of listgroup children.
	 */
	@NotNull
	List<Listgroup> getListgroups();
	/**
	 * Adds new child to the list of listgroup children.
	 * @return created child
	 */
	Listgroup addListgroup();


	/**
	 * Returns the list of listgroupfoot children.
	 * @return the list of listgroupfoot children.
	 */
	@NotNull
	List<Listgroupfoot> getListgroupfoots();
	/**
	 * Adds new child to the list of listgroupfoot children.
	 * @return created child
	 */
	Listgroupfoot addListgroupfoot();


	/**
	 * Returns the list of listhead children.
	 * @return the list of listhead children.
	 */
	@NotNull
	List<Listhead> getListheads();
	/**
	 * Adds new child to the list of listhead children.
	 * @return created child
	 */
	Listhead addListhead();


	/**
	 * Returns the list of listheader children.
	 * @return the list of listheader children.
	 */
	@NotNull
	List<Listheader> getListheaders();
	/**
	 * Adds new child to the list of listheader children.
	 * @return created child
	 */
	Listheader addListheader();


	/**
	 * Returns the list of listitem children.
	 * @return the list of listitem children.
	 */
	@NotNull
	List<Listitem> getListitems();
	/**
	 * Adds new child to the list of listitem children.
	 * @return created child
	 */
	Listitem addListitem();


	/**
	 * Returns the list of menu children.
	 * @return the list of menu children.
	 */
	@NotNull
	List<Menu> getMenus();
	/**
	 * Adds new child to the list of menu children.
	 * @return created child
	 */
	Menu addMenu();


	/**
	 * Returns the list of menuitem children.
	 * @return the list of menuitem children.
	 */
	@NotNull
	List<Menuitem> getMenuitems();
	/**
	 * Adds new child to the list of menuitem children.
	 * @return created child
	 */
	Menuitem addMenuitem();


	/**
	 * Returns the list of menuseparator children.
	 * @return the list of menuseparator children.
	 */
	@NotNull
	List<Menuseparator> getMenuseparators();
	/**
	 * Adds new child to the list of menuseparator children.
	 * @return created child
	 */
	Menuseparator addMenuseparator();


	/**
	 * Returns the list of nav children.
	 * @return the list of nav children.
	 */
	@NotNull
	List<Nav> getNavs();
	/**
	 * Adds new child to the list of nav children.
	 * @return created child
	 */
	Nav addNav();


	/**
	 * Returns the list of navitem children.
	 * @return the list of navitem children.
	 */
	@NotNull
	List<Navitem> getNavitems();
	/**
	 * Adds new child to the list of navitem children.
	 * @return created child
	 */
	Navitem addNavitem();


	/**
	 * Returns the list of navseparator children.
	 * @return the list of navseparator children.
	 */
	@NotNull
	List<Navseparator> getNavseparators();
	/**
	 * Adds new child to the list of navseparator children.
	 * @return created child
	 */
	Navseparator addNavseparator();


	/**
	 * Returns the list of north children.
	 * @return the list of north children.
	 */
	@NotNull
	List<North> getNorths();
	/**
	 * Adds new child to the list of north children.
	 * @return created child
	 */
	North addNorth();


	/**
	 * Returns the list of rows children.
	 * @return the list of rows children.
	 */
	@NotNull
	List<Rows> getRowses();
	/**
	 * Adds new child to the list of rows children.
	 * @return created child
	 */
	Rows addRows();


	/**
	 * Returns the list of row children.
	 * @return the list of row children.
	 */
	@NotNull
	List<Row> getRows();
	/**
	 * Adds new child to the list of row children.
	 * @return created child
	 */
	Row addRow();


	/**
	 * Returns the list of splitter children.
	 * @return the list of splitter children.
	 */
	@NotNull
	List<Splitter> getSplitters();
	/**
	 * Adds new child to the list of splitter children.
	 * @return created child
	 */
	Splitter addSplitter();


	/**
	 * Returns the list of south children.
	 * @return the list of south children.
	 */
	@NotNull
	List<South> getSouths();
	/**
	 * Adds new child to the list of south children.
	 * @return created child
	 */
	South addSouth();


	/**
	 * Returns the list of tab children.
	 * @return the list of tab children.
	 */
	@NotNull
	List<Tab> getTabs();
	/**
	 * Adds new child to the list of tab children.
	 * @return created child
	 */
	Tab addTab();


	/**
	 * Returns the list of tabpanel children.
	 * @return the list of tabpanel children.
	 */
	@NotNull
	List<Tabpanel> getTabpanels();
	/**
	 * Adds new child to the list of tabpanel children.
	 * @return created child
	 */
	Tabpanel addTabpanel();


	/**
	 * Returns the list of tabpanels children.
	 * @return the list of tabpanels children.
	 */
	@NotNull
	List<Tabpanels> getTabpanelses();
	/**
	 * Adds new child to the list of tabpanels children.
	 * @return created child
	 */
	Tabpanels addTabpanels();


	/**
	 * Returns the list of tabs children.
	 * @return the list of tabs children.
	 */
	@NotNull
	List<Tabs> getTabses();
	/**
	 * Adds new child to the list of tabs children.
	 * @return created child
	 */
	Tabs addTabs();


	/**
	 * Returns the list of treecell children.
	 * @return the list of treecell children.
	 */
	@NotNull
	List<Treecell> getTreecells();
	/**
	 * Adds new child to the list of treecell children.
	 * @return created child
	 */
	Treecell addTreecell();


	/**
	 * Returns the list of treechildren children.
	 * @return the list of treechildren children.
	 */
	@NotNull
	List<Treechildren> getTreechildrens();
	/**
	 * Adds new child to the list of treechildren children.
	 * @return created child
	 */
	Treechildren addTreechildren();


	/**
	 * Returns the list of treecol children.
	 * @return the list of treecol children.
	 */
	@NotNull
	List<Treecol> getTreecols();
	/**
	 * Adds new child to the list of treecol children.
	 * @return created child
	 */
	Treecol addTreecol();


	/**
	 * Returns the list of treecols children.
	 * @return the list of treecols children.
	 */
	@NotNull
	List<Treecols> getTreecolses();
	/**
	 * Adds new child to the list of treecols children.
	 * @return created child
	 */
	Treecols addTreecols();


	/**
	 * Returns the list of treefoot children.
	 * @return the list of treefoot children.
	 */
	@NotNull
	List<Treefoot> getTreefoots();
	/**
	 * Adds new child to the list of treefoot children.
	 * @return created child
	 */
	Treefoot addTreefoot();


	/**
	 * Returns the list of treefooter children.
	 * @return the list of treefooter children.
	 */
	@NotNull
	List<Treefooter> getTreefooters();
	/**
	 * Adds new child to the list of treefooter children.
	 * @return created child
	 */
	Treefooter addTreefooter();


	/**
	 * Returns the list of treeitem children.
	 * @return the list of treeitem children.
	 */
	@NotNull
	List<Treeitem> getTreeitems();
	/**
	 * Adds new child to the list of treeitem children.
	 * @return created child
	 */
	Treeitem addTreeitem();


	/**
	 * Returns the list of treerow children.
	 * @return the list of treerow children.
	 */
	@NotNull
	List<Treerow> getTreerows();
	/**
	 * Adds new child to the list of treerow children.
	 * @return created child
	 */
	Treerow addTreerow();


	/**
	 * Returns the list of west children.
	 * @return the list of west children.
	 */
	@NotNull
	List<West> getWests();
	/**
	 * Adds new child to the list of west children.
	 * @return created child
	 */
	West addWest();


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
