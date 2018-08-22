/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.WhenCases.EnumCase;

public class ASTWhenEnumCase extends AbstractApexNode<EnumCase> {

    public ASTWhenEnumCase(EnumCase enumCase) {
        super(enumCase);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
