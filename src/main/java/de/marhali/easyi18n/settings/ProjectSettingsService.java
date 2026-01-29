package de.marhali.easyi18n.settings;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * Persistent storage for project-specific settings.
 *
 * @author marhali
 */
@State(
        name = "ProjectSettingsService",
        storages = @Storage("easy-i18n.xml")
)
public class ProjectSettingsService implements PersistentStateComponent<ProjectSettingsState> {

    private ProjectSettingsState state;

    public ProjectSettingsService() {
        this.state = new ProjectSettingsState();
    }

    public static @NotNull ProjectSettingsService get(@NotNull Project project) {
        return project.getService(ProjectSettingsService.class);
    }

    @Override
    public @NotNull ProjectSettingsState getState() {
        return state;
    }

    /**
     * Sets the provided configuration and invalidates the merged state.
     *
     * @param state New configuration
     */
    public void setState(@NotNull ProjectSettingsState state) {
        this.state = state;
    }

    @Override
    public void loadState(@NotNull ProjectSettingsState state) {
        this.state = state;
    }
}
