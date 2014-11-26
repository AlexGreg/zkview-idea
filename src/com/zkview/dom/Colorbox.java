// Generated on Tue Nov 25 18:01:49 CET 2014
// DTD/Schema  :    http://www.zkoss.org/2005/zul

package com.zkview.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.zkoss.org/2005/zul:colorboxType interface.
 */
public interface Colorbox extends DomElement {

	/**
	 * Returns the value of the color child.
	 * @return the value of the color child.
	 */
	@NotNull
	GenericAttributeValue<String> getColor();


	/**
	 * Returns the value of the value child.
	 * @return the value of the value child.
	 */
	@NotNull
	GenericAttributeValue<String> getValue();


	/**
	 * Returns the value of the disabled child.
	 * @return the value of the disabled child.
	 */
	@NotNull
	GenericAttributeValue<String> getDisabled();


	/**
	 * Returns the value of the onChange child.
	 * @return the value of the onChange child.
	 */
	@NotNull
	GenericAttributeValue<String> getOnChange();


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
