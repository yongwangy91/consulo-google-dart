// This is a generated file. Not intended for manual editing.
package com.jetbrains.lang.dart.psi.impl;

import java.util.List;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import javax.annotation.Nonnull;

import com.jetbrains.lang.dart.psi.*;
import com.jetbrains.lang.dart.util.DartPsiImplUtil;

public class DartPartOfStatementImpl extends DartPsiCompositeElementImpl implements DartPartOfStatement {

  public DartPartOfStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@Nonnull PsiElementVisitor visitor) {
    if (visitor instanceof DartVisitor) ((DartVisitor)visitor).visitPartOfStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nonnull
  public DartLibraryId getLibraryId() {
    return findNotNullChildByClass(DartLibraryId.class);
  }

  @Override
  @Nonnull
  public List<DartMetadata> getMetadataList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DartMetadata.class);
  }

  @Nonnull
  public String getLibraryName() {
    return DartPsiImplUtil.getLibraryName(this);
  }

}
