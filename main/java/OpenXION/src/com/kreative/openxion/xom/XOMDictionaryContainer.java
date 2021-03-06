/*
 * Copyright &copy; 2011 Rebecca G. Bettencourt / Kreative Software
 * <p>
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * <a href="http://www.mozilla.org/MPL/">http://www.mozilla.org/MPL/</a>
 * <p>
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 * <p>
 * Alternatively, the contents of this file may be used under the terms
 * of the GNU Lesser General Public License (the "LGPL License"), in which
 * case the provisions of LGPL License are applicable instead of those
 * above. If you wish to allow use of your version of this file only
 * under the terms of the LGPL License and not to allow others to use
 * your version of this file under the MPL, indicate your decision by
 * deleting the provisions above and replace them with the notice and
 * other provisions required by the LGPL License. If you do not delete
 * the provisions above, a recipient may use your version of this file
 * under either the MPL or the LGPL License.
 * @since OpenXION 1.3
 * @author Rebecca G. Bettencourt, Kreative Software
 */

package com.kreative.openxion.xom;

import com.kreative.openxion.XNContext;
import com.kreative.openxion.ast.XNModifier;

/**
 * The XOMDictionaryContainer interface is implemented by a container
 * that holds a dictionary and requires special handling of dictionary chunks.
 * @since OpenXION 1.3
 * @author Rebecca G. Bettencourt, Kreative Software
 */
public interface XOMDictionaryContainer {
	public boolean canDeleteEntry(XNContext ctx);
	public void deleteEntry(XNContext ctx, String key);
	
	public boolean canGetEntry(XNContext ctx);
	public XOMVariant getEntry(XNContext ctx, String key);
	
	public boolean canPutEntry(XNContext ctx);
	public void putIntoEntry(XNContext ctx, String key, XOMVariant value);
	public void putBeforeEntry(XNContext ctx, String key, XOMVariant value);
	public void putAfterEntry(XNContext ctx, String key, XOMVariant value);
	public void putIntoEntry(XNContext ctx, String key, XOMVariant value, String property, XOMVariant pvalue);
	public void putBeforeEntry(XNContext ctx, String key, XOMVariant value, String property, XOMVariant pvalue);
	public void putAfterEntry(XNContext ctx, String key, XOMVariant value, String property, XOMVariant pvalue);
	
	public boolean canSortEntry(XNContext ctx);
	public void sortEntry(XNContext ctx, String key, XOMComparator cmp);
	
	public boolean canGetEntryProperty(XNContext ctx, String property);
	public XOMVariant getEntryProperty(XNContext ctx, XNModifier modifier, String property, String key);
	
	public boolean canSetEntryProperty(XNContext ctx, String property);
	public void setEntryProperty(XNContext ctx, String property, String key, XOMVariant value);
}
