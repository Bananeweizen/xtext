/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xbase.idea.tests;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import org.eclipse.xtext.idea.tests.LibraryUtil;
import org.eclipse.xtext.idea.tests.LightToolingTest;
import org.eclipse.xtext.xbase.idea.lang.XbaseFileType;

@SuppressWarnings("all")
public abstract class LightXbaseTest extends LightToolingTest {
  public LightXbaseTest() {
    super(XbaseFileType.INSTANCE);
  }
  
  protected void configureModule(final Module module, final ModifiableRootModel model, final ContentEntry contentEntry) {
    LibraryUtil.addXbaseLibrary(model);
  }
}