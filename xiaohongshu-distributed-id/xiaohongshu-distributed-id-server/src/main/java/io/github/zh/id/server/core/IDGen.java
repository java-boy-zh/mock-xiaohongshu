package io.github.zh.id.server.core;


import io.github.zh.id.server.core.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
}
