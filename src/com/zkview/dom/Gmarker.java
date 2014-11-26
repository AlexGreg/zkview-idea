// Generated on Tue Nov 25 18:01:49 CET 2014
// DTD/Schema  :    http://www.zkoss.org/2005/zul

package com.zkview.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.zkoss.org/2005/zul:gmarkerType interface.
 */
public interface Gmarker extends DomElement {

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
	 * Returns the value of the open child.
	 * @return the value of the open child.
	 */
	@NotNull
	GenericAttributeValue<String> getOpen();


	/**
	 * Returns the value of the lng child.
	 * @return the value of the lng child.
	 */
	@NotNull
	GenericAttributeValue<Double> getLng();


	/**
	 * Returns the value of the lat child.
	 * @return the value of the lat child.
	 */
	@NotNull
	GenericAttributeValue<Double> getLat();


	/**
	 * Returns the value of the content child.
	 * @return the value of the content child.
	 */
	@NotNull
	GenericAttributeValue<String> getContent();


	/**
	 * Returns the value of the iconAnchorX child.
	 * @return the value of the iconAnchorX child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconAnchorX();


	/**
	 * Returns the value of the iconAnchorY child.
	 * @return the value of the iconAnchorY child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconAnchorY();


	/**
	 * Returns the value of the iconDragCrossAnchorX child.
	 * @return the value of the iconDragCrossAnchorX child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconDragCrossAnchorX();


	/**
	 * Returns the value of the iconDragCrossAnchorY child.
	 * @return the value of the iconDragCrossAnchorY child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconDragCrossAnchorY();


	/**
	 * Returns the value of the iconDragCrossHeight child.
	 * @return the value of the iconDragCrossHeight child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconDragCrossHeight();


	/**
	 * Returns the value of the iconDragCrossImage child.
	 * @return the value of the iconDragCrossImage child.
	 */
	@NotNull
	GenericAttributeValue<String> getIconDragCrossImage();


	/**
	 * Returns the value of the iconDragCrossWidth child.
	 * @return the value of the iconDragCrossWidth child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconDragCrossWidth();


	/**
	 * Returns the value of the iconImage child.
	 * @return the value of the iconImage child.
	 */
	@NotNull
	GenericAttributeValue<String> getIconImage();


	/**
	 * Returns the value of the iconImageMap child.
	 * @return the value of the iconImageMap child.
	 */
	@NotNull
	GenericAttributeValue<String> getIconImageMap();


	/**
	 * Returns the value of the iconInfoAnchorX child.
	 * @return the value of the iconInfoAnchorX child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconInfoAnchorX();


	/**
	 * Returns the value of the iconInfoAnchorY child.
	 * @return the value of the iconInfoAnchorY child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconInfoAnchorY();


	/**
	 * Returns the value of the iconMaxHeight child.
	 * @return the value of the iconMaxHeight child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconMaxHeight();


	/**
	 * Returns the value of the iconMozPrintImage child.
	 * @return the value of the iconMozPrintImage child.
	 */
	@NotNull
	GenericAttributeValue<String> getIconMozPrintImage();


	/**
	 * Returns the value of the iconPrintImage child.
	 * @return the value of the iconPrintImage child.
	 */
	@NotNull
	GenericAttributeValue<String> getIconPrintImage();


	/**
	 * Returns the value of the iconPrintShadow child.
	 * @return the value of the iconPrintShadow child.
	 */
	@NotNull
	GenericAttributeValue<String> getIconPrintShadow();


	/**
	 * Returns the value of the iconShadow child.
	 * @return the value of the iconShadow child.
	 */
	@NotNull
	GenericAttributeValue<String> getIconShadow();


	/**
	 * Returns the value of the iconShadowHeight child.
	 * @return the value of the iconShadowHeight child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconShadowHeight();


	/**
	 * Returns the value of the iconShadowWidth child.
	 * @return the value of the iconShadowWidth child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconShadowWidth();


	/**
	 * Returns the value of the iconHeight child.
	 * @return the value of the iconHeight child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconHeight();


	/**
	 * Returns the value of the iconWidth child.
	 * @return the value of the iconWidth child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIconWidth();


	/**
	 * Returns the value of the iconTransparent child.
	 * @return the value of the iconTransparent child.
	 */
	@NotNull
	GenericAttributeValue<String> getIconTransparent();


	/**
	 * Returns the value of the onMapDrop child.
	 * @return the value of the onMapDrop child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnMapDrop();


	/**
	 * Returns the value of the onMarkerDrop child.
	 * @return the value of the onMarkerDrop child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnMarkerDrop();


	/**
	 * Returns the list of attribute children.
	 * @return the list of attribute children.
	 */
	@NotNull
	List<Attribute> getAttributes();
	/**
	 * Adds new child to the list of attribute children.
	 * @return created child
	 */
	Attribute addAttribute();


	/**
	 * Returns the list of custom-attributes children.
	 * @return the list of custom-attributes children.
	 */
	@NotNull
	List<GenericDomValue<String>> getCustomAttributeses();
	/**
	 * Adds new child to the list of custom-attributes children.
	 * @return created child
	 */
	GenericDomValue<String> addCustomAttributes();


	/**
	 * Returns the list of variables children.
	 * @return the list of variables children.
	 */
	@NotNull
	List<GenericDomValue<String>> getVariableses();
	/**
	 * Adds new child to the list of variables children.
	 * @return created child
	 */
	GenericDomValue<String> addVariables();


	/**
	 * Returns the list of template children.
	 * @return the list of template children.
	 */
	@NotNull
	List<Template> getTemplates();
	/**
	 * Adds new child to the list of template children.
	 * @return created child
	 */
	Template addTemplate();


	/**
	 * Returns the list of zk children.
	 * @return the list of zk children.
	 */
	@NotNull
	List<Zk> getZks();
	/**
	 * Adds new child to the list of zk children.
	 * @return created child
	 */
	Zk addZk();


}
