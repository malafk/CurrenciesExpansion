package lol.maltest.currencies;

import java.security.cert.Extension;

public class CurrenciesExpansion extends Extension {

    public CurrenciesExpansion plugin;

    @Override
    public void initialize() {
        this.plugin = this;
    }

    @Override
    public void terminate() {
    }
}