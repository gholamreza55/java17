package mojodatZende;

import khodro.Keshti;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MojodatZendeBayad {

    @Test
    void az_ham_ersbari_konid() {
        Keshti keshti = new Keshti();
        Giahan giahan = new Giahan();

        assertThat(giahan instanceof MojodatZende).isTrue();

    }
}
