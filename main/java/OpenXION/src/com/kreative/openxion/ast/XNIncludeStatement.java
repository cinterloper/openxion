/*
 * Copyright &copy; 2010-2011 Rebecca G. Bettencourt / Kreative Software
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
 * @since OpenXION 1.1
 * @author Rebecca G. Bettencourt, Kreative Software
 */

package com.kreative.openxion.ast;

public class XNIncludeStatement extends XNStatement {
	private static final long serialVersionUID = 678L;
	public boolean require;
	public XNExpression scriptName;
	public boolean once;
	public boolean ask;
	
	public XNIncludeStatement(boolean require, XNExpression scriptName, boolean once, boolean ask) {
		this.require = require;
		this.scriptName = scriptName;
		this.once = once;
		this.ask = ask;
	}
	
	protected String toString(String indent) {
		return indent+(require?"require ":"include ")+scriptName.toString()+(once?" once":"")+(ask?" with dialog":" without dialog");
	}
}
