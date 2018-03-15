package be.mielnoelanders.bazinga.service;

import be.mielnoelanders.bazinga.domain.Parameter;
import be.mielnoelanders.bazinga.domain.Publisher;

public interface PublisherService {


// --> create (addOne)



// --> read (findAll & findOneById)



// --> update (updateOneById)



// --> delete (deleteOneById)



// --> others (Bla)





// --> create
    Publisher addOne(Publisher publisher);

// --> read
    Iterable<Publisher> findAll();

    Publisher findOneById(Long id);

// --> update
    Publisher updateOneById(Long id, Publisher publisher);

// --> delete
    boolean deleteOneById(Long id);

// --> others
    // boolean updatePublisherByName(Publisher publisher);

    Publisher findByName(String name);
}

