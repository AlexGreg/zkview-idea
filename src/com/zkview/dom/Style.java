// Generated on Tue Nov 25 18:01:49 CET 2014
// DTD/Schema  :    http://www.zkoss.org/2005/zul

package com.zkview.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.zkoss.org/2005/zul:styleType interface.
 */
public interface Style extends DomElement {

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
	 * Returns the value of the src child.
	 * @return the value of the src child.
	 */
	@NotNull
	GenericAttributeValue<String> getSrc();


	/**
	 * Returns the value of the content child.
	 * @return the value of the content child.
	 */
	@NotNull
	GenericAttributeValue<String> getContent();


	/**
	 * Returns the value of the media child.
	 * @return the value of the media child.
	 */
	@NotNull
	GenericAttributeValue<String> getMedia();


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
