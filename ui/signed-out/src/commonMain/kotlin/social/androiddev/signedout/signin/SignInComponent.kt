/*
 * This file is part of Dodo.
 *
 * Dodo is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * Dodo is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Dodo. If not, see <https://www.gnu.org/licenses/>.
 */
package social.androiddev.signedout.signin

import kotlinx.coroutines.flow.StateFlow

/**
 * The base component describing all business logic needed for the sign up or sign in screen
 */
interface SignInComponent {

    fun onCloseClicked()

    fun onParseResponseFromUrl(url: String)

    fun onErrorFromOAuth(error: String)

    val state: StateFlow<State>

    data class State(
        val server: String,
        val oauthAuthorizeUrl: String,
        val redirectUri: String,
        val error: String? = null,
        val showOAuthFlow: Boolean = false,
        val showSpinner: Boolean = false,
    )
}