package fast.rocket.builder;

import java.io.File;

public interface LoadBuilder<L> {
    /**
     * Load an uri.
     * @param uri Uri to load. This may be a http(s), file, or content uri.
     * @return
     */
    public L load(String uri);

    /**
     * Load an url using the given an HTTP method such as GET,POST,PUT or DEELETE.
     * @param method HTTP method such as GET or POST.
     * @param url Url to load.
     * @return
     */

    public L load(int method, String url);

    /**
     * Load a file from local or remote.
     * @param file File to load.
     * @return
     */
    public L load(File file);
}