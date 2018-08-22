/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.WhenCases.LiteralCase;

public class ASTWhenLiteralCase extends AbstractApexNode<LiteralCase> {

    public ASTWhenLiteralCase(LiteralCase literalCase) {
        super(literalCase);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
