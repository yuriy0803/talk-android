/*
 * Nextcloud Talk application
 *
 * @author Mario Danic
 * Copyright (C) 2017 Mario Danic <mario@lovelyhq.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nextcloud.talk.utils.preferences;

import net.orange_box.storebox.annotations.method.ClearMethod;
import net.orange_box.storebox.annotations.method.KeyByString;
import net.orange_box.storebox.annotations.method.RegisterChangeListenerMethod;
import net.orange_box.storebox.annotations.method.RemoveMethod;
import net.orange_box.storebox.annotations.method.UnregisterChangeListenerMethod;
import net.orange_box.storebox.annotations.option.SaveOption;
import net.orange_box.storebox.enums.SaveMode;
import net.orange_box.storebox.listeners.OnPreferenceValueChangedListener;

@SaveOption(SaveMode.APPLY)
public interface AppPreferences {

    @KeyByString("proxy_type")
    @RegisterChangeListenerMethod
    void registerProxyTypeListener(OnPreferenceValueChangedListener<String> listener);

    @KeyByString("proxy_type")
    @UnregisterChangeListenerMethod
    void unregisterProxyTypeListener(OnPreferenceValueChangedListener<String> listener);

    @KeyByString("proxy_type")
    String getProxyType();

    @KeyByString("proxy_type")
    void setProxyType(String proxyType);

    @KeyByString("proxy_server")
    @RemoveMethod
    void removeProxyType();

    @KeyByString("proxy_host")
    String getProxyHost();

    @KeyByString("proxy_host")
    void setProxyHost(String proxyHost);

    @KeyByString("proxy_host")
    @RemoveMethod
    void removeProxyHost();

    @KeyByString("proxy_port")
    String getProxyPort();

    @KeyByString("proxy_port")
    void setProxyPort(String proxyPort);

    @KeyByString("proxy_port")
    @RemoveMethod
    void removeProxyPort();

    @KeyByString("proxy_credentials")
    @RegisterChangeListenerMethod
    void registerProxyCredentialsListener(OnPreferenceValueChangedListener<Boolean> listener);

    @KeyByString("proxy_credentials")
    @UnregisterChangeListenerMethod
    void unregisterProxyCredentialsListener(OnPreferenceValueChangedListener<Boolean> listener);

    @KeyByString("proxy_credentials")
    boolean getProxyCredentials();

    @KeyByString("proxy_credentials")
    void setProxyNeedsCredentials(boolean proxyNeedsCredentials);

    @KeyByString("proxy_credentials")
    @RemoveMethod
    void removeProxyCredentials();

    @KeyByString("proxy_username")
    String getProxyUsername();

    @KeyByString("proxy_username")
    void setProxyUsername(String proxyUsername);

    @KeyByString("proxy_username")
    @RemoveMethod
    void removeProxyUsername();

    @KeyByString("proxy_password")
    String getProxyPassword();

    @KeyByString("proxy_password")
    void setProxyPassword(String proxyPassword);

    @KeyByString("proxy_password")
    @RemoveMethod
    void removeProxyPassword();

    @KeyByString("push_token")
    String getPushToken();

    @KeyByString("push_token")
    void setPushToken(String pushToken);

    @KeyByString("push_token")
    @RemoveMethod
    void removePushToken();

    @KeyByString("tempClientCertAlias")
    String getTemporaryClientCertAlias();

    @KeyByString("tempClientCertAlias")
    void setTemporaryClientCertAlias(String alias);

    @KeyByString("tempClientCertAlias")
    @RemoveMethod
    void removeTemporaryClientCertAlias();

    @KeyByString("pushToTalk_intro_shown")
    boolean getPushToTalkIntroShown();

    @KeyByString("pushToTalk_intro_shown")
    void setPushToTalkIntroShown(boolean shown);

    @KeyByString("pushToTalk_intro_shown")
    @RemoveMethod
    void removePushToTalkIntroShown();

    @ClearMethod
    void clear();
}
