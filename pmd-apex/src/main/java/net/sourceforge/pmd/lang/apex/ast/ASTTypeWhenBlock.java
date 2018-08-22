/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.TypeWhenBlock;

public class ASTTypeWhenBlock extends AbstractApexNode<TypeWhenBlock> {

    public ASTTypeWhenBlock(TypeWhenBlock typeWhenBlock) {
        super(typeWhenBlock);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
