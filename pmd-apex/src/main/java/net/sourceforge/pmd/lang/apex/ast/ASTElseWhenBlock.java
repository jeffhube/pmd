/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.ElseWhenBlock;

public class ASTElseWhenBlock extends AbstractApexNode<ElseWhenBlock> {

    public ASTElseWhenBlock(ElseWhenBlock elseWhenBlock) {
        super(elseWhenBlock);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
