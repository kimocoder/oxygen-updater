package com.arjanvlek.oxygenupdater.settings;

import com.arjanvlek.oxygenupdater.internal.OxygenUpdaterException;

/**
 * Oxygen Updater, copyright 2019 Arjan Vlek. File created by arjan.vlek on 05/05/2019.
 */
public class UserSettingsCouldNotBeSavedException extends OxygenUpdaterException {

	public UserSettingsCouldNotBeSavedException(String reason) {
		super(reason);
	}
}
