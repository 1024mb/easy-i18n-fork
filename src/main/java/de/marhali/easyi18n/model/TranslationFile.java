package de.marhali.easyi18n.model;

import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents an existing translation file in a context a specific folder strategy.
 *
 * @author marhali
 */
public record TranslationFile(@NotNull VirtualFile virtualFile, @NotNull String locale, @Nullable KeyPath namespace) {

    @Override
    public String toString() {
        return "TranslationFile{" +
                "virtualFile=" + virtualFile +
                ", locale='" + locale + '\'' +
                ", namespace='" + namespace + '\'' +
                '}';
    }
}
