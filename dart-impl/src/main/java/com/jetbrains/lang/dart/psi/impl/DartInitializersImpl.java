// This is a generated file. Not intended for manual editing.
package com.jetbrains.lang.dart.psi.impl;

import java.util.List;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import javax.annotation.Nonnull;

import com.jetbrains.lang.dart.psi.*;

public class DartInitializersImpl extends DartPsiCompositeElementImpl implements DartInitializers {

  public DartInitializersImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof DartVisitor) ((DartVisitor)visitor).visitInitializers(this);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public List<DartSuperCallOrFieldInitializer> getSuperCallOrFieldInitializerList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DartSuperCallOrFieldInitializer.class);
  }

}
