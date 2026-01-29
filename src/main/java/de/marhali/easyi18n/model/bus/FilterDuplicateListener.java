package de.marhali.easyi18n.model.bus;

/**
 * Single event listener
 *
 * @author marhali
 * @see #onFilterDuplicate(boolean)
 */
public interface FilterDuplicateListener {
    /**
     * Toggles filter of duplicated translation values
     *
     * @param filter True if only translations with duplicates values should be shown
     */
    void onFilterDuplicate(boolean filter);
}
