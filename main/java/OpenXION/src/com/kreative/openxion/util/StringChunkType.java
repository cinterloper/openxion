/*
 * Copyright &copy; 2009-2014 Rebecca G. Bettencourt / Kreative Software
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
 * @since OpenXION 0.9
 * @author Rebecca G. Bettencourt, Kreative Software
 */

package com.kreative.openxion.util;

/**
 * The StringChunkType enum represents a chunk
 * (character, line, item, row, column, word,
 * sentence, or paragraph) of a string.
 * @since OpenXION 0.9
 * @author Rebecca G. Bettencourt, Kreative Software
 */
public enum StringChunkType {
	CHARACTER {
		@Override
		public StringChunkDefinition getDefinition(String nl, String id, String cd, String rd) {
			return StringChunkDefinition.Character.getInstance();
		}
	},
	LINE {
		@Override
		public StringChunkDefinition getDefinition(String nl, String id, String cd, String rd) {
			return StringChunkDefinition.Line.getInstance(nl);
		}
	},
	ITEM {
		@Override
		public StringChunkDefinition getDefinition(String nl, String id, String cd, String rd) {
			return StringChunkDefinition.Item.getInstance(id);
		}
	},
	COLUMN {
		@Override
		public StringChunkDefinition getDefinition(String nl, String id, String cd, String rd) {
			return StringChunkDefinition.Item.getInstance(cd);
		}
	},
	ROW {
		@Override
		public StringChunkDefinition getDefinition(String nl, String id, String cd, String rd) {
			return StringChunkDefinition.Item.getInstance(rd);
		}
	},
	WORD {
		@Override
		public StringChunkDefinition getDefinition(String nl, String id, String cd, String rd) {
			return StringChunkDefinition.Word.getInstance();
		}
	},
	SENTENCE {
		@Override
		public StringChunkDefinition getDefinition(String nl, String id, String cd, String rd) {
			return StringChunkDefinition.Sentence.getInstance();
		}
	},
	PARAGRAPH {
		@Override
		public StringChunkDefinition getDefinition(String nl, String id, String cd, String rd) {
			return StringChunkDefinition.Paragraph.getInstance();
		}
	};
	
	public abstract StringChunkDefinition getDefinition(String nl, String id, String cd, String rd);
	
	public String toString() {
		return name().toLowerCase();
	}
	
	public String toPluralString() {
		return name().toLowerCase()+"s";
	}
}
