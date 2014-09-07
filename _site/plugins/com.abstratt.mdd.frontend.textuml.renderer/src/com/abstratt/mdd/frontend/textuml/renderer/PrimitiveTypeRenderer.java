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
package com.abstratt.mdd.frontend.textuml.renderer;

import static com.abstratt.mdd.frontend.textuml.renderer.TextUMLRenderingUtils.name;

import org.eclipse.uml2.uml.PrimitiveType;

import com.abstratt.modelrenderer.IEObjectRenderer;
import com.abstratt.modelrenderer.IRenderingSession;
import com.abstratt.modelrenderer.IndentedPrintWriter;

public class PrimitiveTypeRenderer implements IEObjectRenderer<PrimitiveType> {
	public boolean renderObject(PrimitiveType toRender, IndentedPrintWriter writer, IRenderingSession context) {
		context.renderAll(toRender.getOwnedComments());
		TextUMLRenderingUtils.renderStereotypeApplications(writer, toRender);
		writer.println("primitive " + name(toRender) + ";");
		writer.println();
		return true;
	}
}
