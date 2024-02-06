package Git.example.demo.Services;

import Git.example.demo.Models.Game;
import Git.example.demo.Models.ShoppingCart;
import Git.example.demo.Repository.CustomerRepository;
import Git.example.demo.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ShoppingCartService {
    @Autowired
    GameRepository gameRepository;
    @Autowired
    CustomerRepository customerRepository;


    // CREATE new shopping cart
    // tom lista
 /*

    // ADD game to shopping cart
    public ShoppingCart addtoCart (ShoppingCart shoppingCart) {
        String gameId = game.getId();
        Optional<Game> game = gameRepository.findById(gameId);
    }

    public Loan createLoan(Loan loan) {
        String bookId = loan.getBookId();
        Optional<Book> book = bookRepository.findById(bookId);
        if (book.isPresent()) {
            Book foundBook = book.get();
            if (!foundBook.getAvailable()) {
                throw new EntityNotFoundException("This book is not available for lending right now.");
            } else {
                foundBook.setAvailable(false);
                bookRepository.save(foundBook);
            }
        }
        loan.setBorrowed(LocalDate.now());
        loan.setReturnDate(LocalDate.now().plusDays(14));
        return loanRepository.save(loan);
    }

*/


    // DELETE game from shopping cart

}
