/*
 *  Copyright (c) 2018 Cerus
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 * Cerus
 *
 */

package de.cerus.serveripobfuscator;

import net.minecraft.client.gui.widget.button.CheckboxButton;

import java.util.function.Consumer;

public class BetterCheckboxButton extends CheckboxButton {

    private Consumer<Boolean> consumer;

    public BetterCheckboxButton(int p_i51140_1_, int p_i51140_2_, int p_i51140_3_, int p_i51140_4_, String p_i51140_5_, boolean p_i51140_6_, Consumer<Boolean> consumer) {
        super(p_i51140_1_, p_i51140_2_, p_i51140_3_, p_i51140_4_, p_i51140_5_, p_i51140_6_);
        this.consumer = consumer;
    }

    @Override
    public void onPress() {
        super.onPress();
        consumer.accept(this.func_212942_a());
    }
}
