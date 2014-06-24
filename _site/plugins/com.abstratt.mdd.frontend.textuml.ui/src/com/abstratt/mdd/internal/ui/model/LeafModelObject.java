/*******************************************************************************
 * Copyright (c) 2006, 2008 Abstratt Technologies
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rafael Chaves (Abstratt Technologies) - initial API and implementation
 *******************************************************************************/ 
package com.abstratt.mdd.internal.ui.model;

import java.util.Collections;
import java.util.List;

import com.abstratt.mdd.frontend.core.ASTNode;

public abstract class LeafModelObject extends UIModelObject {

	public LeafModelObject(UIModelObject parent, ASTNode node) {
		super(parent, node);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List getChildren() {
		return Collections.EMPTY_LIST;
	}
}