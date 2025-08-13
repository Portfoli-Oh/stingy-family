package top.barakaon.stingy_family;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcards")
public class CashCardController {
    @GetMapping("/{id}")
    private ResponseEntity<CashCard> findCashCardById(@PathVariable Long id){
      CashCard cashCard = new CashCard(id,38900,"233gdhbcyjgeychgeye");

      return ResponseEntity.ok(cashCard);
    }
}
