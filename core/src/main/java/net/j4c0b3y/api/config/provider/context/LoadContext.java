package net.j4c0b3y.api.config.provider.context;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author J4C0B3Y
 * @version ConfigAPI
 * @since 10/01/2025
 */
@Getter
@RequiredArgsConstructor
public class LoadContext {
    /**
     * The key to load from.
     */
    private final String key;

    /**
     * The object to deserialize.
     */
    private final Object object;
}
