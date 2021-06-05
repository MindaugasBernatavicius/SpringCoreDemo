package cf.mindaugas._01_dependencyinjection;

import java.util.List;

public interface Repository {
    public List<String> findAll();
    public List<String> findById();
}
