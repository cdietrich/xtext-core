/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.nodemodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class CompositeNode extends org.eclipse.xtext.nodemodel.impl.CompositeNode {

	@Override
	protected BidiIterable<AbstractNode> basicGetChildren() {
		return super.basicGetChildren();
	}

	@Override
	protected AbstractNode basicGetFirstChild() {
		return super.basicGetFirstChild();
	}

	@Override
	protected void basicSetFirstChild(AbstractNode firstChild) {
		super.basicSetFirstChild(firstChild);
	}

	@Override
	protected AbstractNode basicGetLastChild() {
		return super.basicGetLastChild();
	}

	@Override
	protected org.eclipse.xtext.nodemodel.impl.CompositeNode basicGetParent() {
		return super.basicGetParent();
	}

	@Override
	protected void basicSetParent(org.eclipse.xtext.nodemodel.impl.CompositeNode parent) {
		super.basicSetParent(parent);
	}

	@Override
	protected BidiIterator<AbstractNode> basicIterator() {
		return super.basicIterator();
	}

	@Override
	protected BidiTreeIterator<AbstractNode> basicTreeIterator() {
		return super.basicTreeIterator();
	}

	@Override
	protected EObject basicGetSemanticElement() {
		return super.basicGetSemanticElement();
	}

	@Override
	protected Object basicGetGrammarElement() {
		return super.basicGetGrammarElement();
	}

	@Override
	protected void basicSetGrammarElement(Object grammarElementOrArray) {
		super.basicSetGrammarElement(grammarElementOrArray);
	}

	@Override
	protected AbstractNode basicGetPreviousSibling() {
		return super.basicGetPreviousSibling();
	}

	@Override
	protected void basicSetPreviousSibling(AbstractNode prev) {
		super.basicSetPreviousSibling(prev);
	}

	@Override
	protected AbstractNode basicGetNextSibling() {
		return super.basicGetNextSibling();
	}

	@Override
	protected void basicSetNextSibling(AbstractNode next) {
		super.basicSetNextSibling(next);
	}

	@Override
	protected boolean basicHasPreviousSibling() {
		return super.basicHasPreviousSibling();
	}

	@Override
	protected boolean basicHasNextSibling() {
		return super.basicHasNextSibling();
	}

}
