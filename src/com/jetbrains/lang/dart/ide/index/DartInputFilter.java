package com.jetbrains.lang.dart.ide.index;

import org.jetbrains.annotations.NotNull;
import com.intellij.ide.highlighter.HtmlFileType;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.indexing.FileBasedIndex;
import com.jetbrains.lang.dart.DartFileType;

public class DartInputFilter implements FileBasedIndex.InputFilter {
  public static DartInputFilter INSTANCE = new DartInputFilter();

  @Override
  public boolean acceptInput(Project project, @NotNull VirtualFile file) {
    FileType type = file.getFileType();
    return type == DartFileType.INSTANCE || type == HtmlFileType.INSTANCE;
  }
}
