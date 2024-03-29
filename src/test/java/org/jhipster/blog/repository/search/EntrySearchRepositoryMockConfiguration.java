package org.jhipster.blog.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of {@link EntrySearchRepository} to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class EntrySearchRepositoryMockConfiguration {

    @MockBean
    private EntrySearchRepository mockEntrySearchRepository;

}
