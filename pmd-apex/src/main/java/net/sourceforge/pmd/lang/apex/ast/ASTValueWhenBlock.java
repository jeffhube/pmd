/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.ValueWhenBlock;

public class ASTValueWhenBlock extends AbstractApexNode<ValueWhenBlock> {

    public ASTValueWhenBlock(ValueWhenBlock valueWhenBlock) {
        super(valueWhenBlock);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
