
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Alphabet {
    private final ArrayList<Character> spanishAlphabet = new ArrayList<>();
    private final ArrayList<Character> spanishCommons = new ArrayList<>();
    private final ArrayList<Character> frenchAlphabet = new ArrayList<>();
    private final ArrayList<Character> frenchCommons = new ArrayList<>();
    private final ArrayList<Character> germanAlphabet = new ArrayList<>();
    private final ArrayList<Character> germanCommons = new ArrayList<>();
    private final ArrayList<Character> italianAlphabet = new ArrayList<>();
    private final ArrayList<Character> italianCommons = new ArrayList<>();
    private final ArrayList<Character> portugueseAlphabet = new ArrayList<>();
    private final ArrayList<Character> portugueseCommons = new ArrayList<>();
    private final ArrayList<Character> russianAlphabet = new ArrayList<>();
    private final ArrayList<Character> arabicAlphabet = new ArrayList<>();
    private final ArrayList<Character> chineseAlphabet = new ArrayList<>();
    private final ArrayList<Character> japaneseAlphabet = new ArrayList<>();
    public Alphabet() {


        // Adding alphabets with similar characters
        for (char letter = 'a'; letter <= 'z'; letter++) {
            spanishAlphabet.add(letter);
            frenchAlphabet.add(letter);
            germanAlphabet.add(letter);
            italianAlphabet.add(letter);
            portugueseAlphabet.add(letter);
        }

        // special characters
        spanishAlphabet.add('á');
        spanishAlphabet.add('é');
        spanishAlphabet.add('í');
        spanishAlphabet.add('ó');
        spanishAlphabet.add('ú');
        spanishAlphabet.add('ñ');
        spanishAlphabet.add('ü');
        spanishAlphabet.add('¿');
        spanishAlphabet.add('¡');
        // common characters
        spanishCommons.add('a');
        spanishCommons.add('á');
        spanishCommons.add('í');
        spanishCommons.add('é');
        spanishCommons.add('ó');
        spanishCommons.add('ú');
        spanishCommons.add('¡');
        spanishCommons.add('i');
        spanishCommons.add('e');
        spanishCommons.add('o');
        spanishCommons.add('u');

        frenchAlphabet.add('é');
        frenchAlphabet.add('è');
        frenchAlphabet.add('ê');
        frenchAlphabet.add('à');
        frenchAlphabet.add('ç');
        frenchAlphabet.add('î');
        frenchAlphabet.add('ô');
        frenchAlphabet.add('ù');
        frenchAlphabet.add('û');
        // common characters
        frenchCommons.add('a');
        frenchCommons.add('i');
        frenchCommons.add('e');
        frenchCommons.add('o');
        frenchCommons.add('u');
        frenchCommons.add('é');
        frenchCommons.add('è');
        frenchCommons.add('ê');
        frenchCommons.add('à');
        frenchCommons.add('î');
        frenchCommons.add('ô');
        frenchCommons.add('ù');
        frenchCommons.add('û');

        germanAlphabet.add('ä');
        germanAlphabet.add('ö');
        germanAlphabet.add('ü');
        germanAlphabet.add('ß');
        // common characters
        germanCommons.add('a');
        germanCommons.add('i');
        germanCommons.add('e');
        germanCommons.add('o');
        germanCommons.add('u');
        germanCommons.add('ä');
        germanCommons.add('ö');
        germanCommons.add('ü');
        germanCommons.add('ß');


        italianAlphabet.add('à');
        italianAlphabet.add('è');
        italianAlphabet.add('é');
        italianAlphabet.add('ì');
        italianAlphabet.add('ò');
        italianAlphabet.add('ù');
        // common characters
        italianCommons.add('a');
        italianCommons.add('i');
        italianCommons.add('e');
        italianCommons.add('o');
        italianCommons.add('u');
        italianCommons.add('à');
        italianCommons.add('è');
        italianCommons.add('é');
        italianCommons.add('ì');
        italianCommons.add('ò');
        italianCommons.add('ù');

        portugueseAlphabet.add('á');
        portugueseAlphabet.add('à');
        portugueseAlphabet.add('â');
        portugueseAlphabet.add('ã');
        portugueseAlphabet.add('é');
        portugueseAlphabet.add('ê');
        portugueseAlphabet.add('í');
        portugueseAlphabet.add('ó');
        portugueseAlphabet.add('ô');
        portugueseAlphabet.add('õ');
        portugueseAlphabet.add('ú');
        portugueseAlphabet.add('ü');
        // common characters
        portugueseCommons.add('a');
        portugueseCommons.add('i');
        portugueseCommons.add('e');
        portugueseCommons.add('o');
        portugueseCommons.add('u');
        portugueseCommons.add('á');
        portugueseCommons.add('à');
        portugueseCommons.add('â');
        portugueseCommons.add('ã');
        portugueseCommons.add('é');
        portugueseCommons.add('ê');
        portugueseCommons.add('í');
        portugueseCommons.add('ó');
        portugueseCommons.add('ô');
        portugueseCommons.add('õ');
        portugueseCommons.add('ú');
        portugueseCommons.add('ü');

        // Russian alphabet
        russianAlphabet.add('а');
        russianAlphabet.add('б');
        russianAlphabet.add('в');
        russianAlphabet.add('г');
        russianAlphabet.add('д');
        russianAlphabet.add('е');
        russianAlphabet.add('ё');
        russianAlphabet.add('ж');
        russianAlphabet.add('и');
        russianAlphabet.add('к');
        russianAlphabet.add('л');
        russianAlphabet.add('м');
        russianAlphabet.add('н');
        russianAlphabet.add('о');
        russianAlphabet.add('п');
        russianAlphabet.add('р');
        russianAlphabet.add('с');
        russianAlphabet.add('т');
        russianAlphabet.add('у');
        russianAlphabet.add('ф');
        russianAlphabet.add('х');
        russianAlphabet.add('ц');
        russianAlphabet.add('ч');
        russianAlphabet.add('ш');
        russianAlphabet.add('щ');
        russianAlphabet.add('ъ');
        russianAlphabet.add('ы');
        russianAlphabet.add('ь');
        russianAlphabet.add('э');
        russianAlphabet.add('ю');
        russianAlphabet.add('я');

        // Arabic alphabet
        arabicAlphabet.add('ا');
        arabicAlphabet.add('ب');
        arabicAlphabet.add('ت');
        arabicAlphabet.add('ث');
        arabicAlphabet.add('ج');
        arabicAlphabet.add('ح');
        arabicAlphabet.add('خ');
        arabicAlphabet.add('د');
        arabicAlphabet.add('ذ');
        arabicAlphabet.add('ر');
        arabicAlphabet.add('ز');
        arabicAlphabet.add('س');
        arabicAlphabet.add('ش');
        arabicAlphabet.add('ص');
        arabicAlphabet.add('ض');
        arabicAlphabet.add('ط');
        arabicAlphabet.add('ظ');
        arabicAlphabet.add('ع');
        arabicAlphabet.add('غ');
        arabicAlphabet.add('ف');
        arabicAlphabet.add('ق');
        arabicAlphabet.add('ك');
        arabicAlphabet.add('ل');
        arabicAlphabet.add('م');
        arabicAlphabet.add('ن');
        arabicAlphabet.add('ه');
        arabicAlphabet.add('و');
        arabicAlphabet.add('ي');

        // Since Chinese doesn't have an alphabet like the Latin, Cyrillic, or Arabic script
        // we will generate random words in its place
        chineseAlphabet.add('吃'); // chī - to eat
        chineseAlphabet.add('喝'); // hē - to drink
        chineseAlphabet.add('睡'); // shuìjiào - sleep
        chineseAlphabet.add('看'); // kàn - to see, to watch
        chineseAlphabet.add('听'); // tīng - to listen
        chineseAlphabet.add('说'); // shuō - to speak
        chineseAlphabet.add('写'); // xiě - to write
        chineseAlphabet.add('读'); // dú - to read
        chineseAlphabet.add('学'); // xué - to learn
        chineseAlphabet.add('做'); // zuò - to do, to make
        chineseAlphabet.add('买'); // mǎi - to buy
        chineseAlphabet.add('卖'); // mài - to sell
        chineseAlphabet.add('你'); // nǐ - you
        chineseAlphabet.add('好'); // hǎo - good
        chineseAlphabet.add('的'); // de - possessive particle
        chineseAlphabet.add('我'); // wǒ - I, me
        chineseAlphabet.add('是'); // shì - to be
        chineseAlphabet.add('在'); // zài - at, in
        chineseAlphabet.add('有'); // yǒu - to have
        chineseAlphabet.add('一'); // yī - one
        chineseAlphabet.add('个'); // gè - a, an
        chineseAlphabet.add('他'); // tā - he, him
        chineseAlphabet.add('她'); // tā - she, her
        chineseAlphabet.add('们'); // men - plural marker for pronouns
        chineseAlphabet.add('不'); // bù - not
        chineseAlphabet.add('这'); // zhè - this
        chineseAlphabet.add('吗'); // ma - question particle
        chineseAlphabet.add('很'); // hěn - very
        chineseAlphabet.add('大'); // dà - big
        chineseAlphabet.add('小'); // xiǎo - small
        chineseAlphabet.add('会'); // huì - can, know how to
        chineseAlphabet.add('来'); // lái - to come
        chineseAlphabet.add('去'); // qù - to go
        chineseAlphabet.add('爱'); // ài - love
        chineseAlphabet.add('家'); // jiā - family, home
        chineseAlphabet.add('中'); // Zhōngwén - Chinese

        // Japanese alphabet
        japaneseAlphabet.add('あ'); // a - hiragana character
        japaneseAlphabet.add('い'); // i - hiragana character
        japaneseAlphabet.add('う'); // u - hiragana character
        japaneseAlphabet.add('え'); // e - hiragana character
        japaneseAlphabet.add('お'); // o - hiragana character
        japaneseAlphabet.add('か'); // ka - hiragana character
        japaneseAlphabet.add('き'); // ki - hiragana character
        japaneseAlphabet.add('く'); // ku - hiragana character
        japaneseAlphabet.add('け'); // ke - hiragana character
        japaneseAlphabet.add('こ'); // ko - hiragana character
        japaneseAlphabet.add('さ'); // sa - hiragana character
        japaneseAlphabet.add('し'); // shi - hiragana character
        japaneseAlphabet.add('す'); // su - hiragana character
        japaneseAlphabet.add('せ'); // se - hiragana character
        japaneseAlphabet.add('そ'); // so - hiragana character
        japaneseAlphabet.add('た'); // ta - hiragana character
        japaneseAlphabet.add('ち'); // chi - hiragana character
        japaneseAlphabet.add('つ'); // tsu - hiragana character
        japaneseAlphabet.add('て'); // te - hiragana character
        japaneseAlphabet.add('と'); // to - hiragana character
        japaneseAlphabet.add('な'); // na - hiragana character
        japaneseAlphabet.add('に'); // ni - hiragana character
        japaneseAlphabet.add('ぬ'); // nu - hiragana character
        japaneseAlphabet.add('ね'); // ne - hiragana character
        japaneseAlphabet.add('の'); // no - hiragana character
        japaneseAlphabet.add('は'); // ha - hiragana character
        japaneseAlphabet.add('ひ'); // hi - hiragana character
        japaneseAlphabet.add('ふ'); // fu - hiragana character
        japaneseAlphabet.add('へ'); // he - hiragana character
        japaneseAlphabet.add('ほ'); // ho - hiragana character
        japaneseAlphabet.add('ま'); // ma - hiragana character
        japaneseAlphabet.add('み'); // mi - hiragana character
        japaneseAlphabet.add('む'); // mu - hiragana character
        japaneseAlphabet.add('め'); // me - hiragana character
        japaneseAlphabet.add('も'); // mo - hiragana character
        japaneseAlphabet.add('や'); // ya - hiragana character
        japaneseAlphabet.add('ゆ'); // yu - hiragana character
        japaneseAlphabet.add('よ'); // yo - hiragana character
        japaneseAlphabet.add('ら'); // ra - hiragana character
        japaneseAlphabet.add('り'); // ri - hiragana character
        japaneseAlphabet.add('る'); // ru - hiragana character
        japaneseAlphabet.add('れ'); // re - hiragana character
        japaneseAlphabet.add('ろ'); // ro - hiragana character
        japaneseAlphabet.add('わ'); // wa - hiragana character
        japaneseAlphabet.add('を'); // wo - hiragana character
        japaneseAlphabet.add('ん'); // n - hiragana character
        japaneseAlphabet.add('一'); // ichi - kanji character (one)
        japaneseAlphabet.add('二'); // ni - kanji character (two)
        japaneseAlphabet.add('三'); // san - kanji character (three)
        japaneseAlphabet.add('四'); // shi/yon - kanji character (four)
        japaneseAlphabet.add('五'); // go - kanji character (five)
        japaneseAlphabet.add('六'); // roku - kanji character (six)
        japaneseAlphabet.add('七'); // shichi/nana - kanji character (seven)
        japaneseAlphabet.add('八'); // hachi - kanji character (eight)
        japaneseAlphabet.add('九'); // kyū/ku - kanji character (nine)
        japaneseAlphabet.add('十'); // jū - kanji character (ten)

    }

    public char generateChar(String langSelectorBox, char charToChange) {
        Random rdm = new Random();
        if (langSelectorBox.equals("Spanish")) {
            if ((charToChange == 'a') || (charToChange == 'á') || (charToChange == 'í') || (charToChange == 'é')
                    || (charToChange == 'ó') || (charToChange == 'ú') || (charToChange == '¡') || (charToChange == 'i')
                    || (charToChange == 'e') || (charToChange == 'o') || (charToChange == 'u'))
            {
                return spanishCommons.get(rdm.nextInt(spanishCommons.size()));
            }
            else {
                return spanishAlphabet.get(rdm.nextInt(spanishAlphabet.size()));
            }
        } else if (langSelectorBox.equals("French")) {
            if ((charToChange == 'a') || (charToChange == 'i') || (charToChange == 'e') || (charToChange == 'o')
                    || (charToChange == 'u') || (charToChange == 'é') || (charToChange == 'è') || (charToChange == 'ê')
                    || (charToChange == 'à') || (charToChange == 'î') || (charToChange == 'ô') || (charToChange == 'ù')
                    || (charToChange == 'û')) {
                return frenchCommons.get(rdm.nextInt(frenchCommons.size()));
            } else {
                return frenchAlphabet.get(rdm.nextInt(frenchAlphabet.size()));
            }
        } else if (langSelectorBox.equals("German")) {
            if ((charToChange == 'a') || (charToChange == 'i') || (charToChange == 'e') || (charToChange == 'o')
                    || (charToChange == 'u') || (charToChange == 'ä') || (charToChange == 'ö') || (charToChange == 'ü')
                    || (charToChange == 'ß')) {
                return germanCommons.get(rdm.nextInt(germanCommons.size()));
            } else {
                return germanAlphabet.get(rdm.nextInt(germanAlphabet.size()));
            }
        } else if (langSelectorBox.equals("Italian")) {
            if ((charToChange == 'a') || (charToChange == 'i') || (charToChange == 'e') || (charToChange == 'o')
                    || (charToChange == 'u') || (charToChange == 'à') || (charToChange == 'è') || (charToChange == 'é')
                    || (charToChange == 'ì') || (charToChange == 'ò') || (charToChange == 'ù')) {
                return italianCommons.get(rdm.nextInt(italianCommons.size()));
            } else {
                return italianAlphabet.get(rdm.nextInt(italianAlphabet.size()));
            }
        } else if (langSelectorBox.equals("Portuguese")) {
            if ((charToChange == 'a') || (charToChange == 'i') || (charToChange == 'e') || (charToChange == 'o')
                    || (charToChange == 'u') || (charToChange == 'á') || (charToChange == 'à') || (charToChange == 'â')
                    || (charToChange == 'ã') || (charToChange == 'é') || (charToChange == 'ê') || (charToChange == 'í')
                    || (charToChange == 'ó') || (charToChange == 'ô') || (charToChange == 'õ') || (charToChange == 'ú')
                    || (charToChange == 'ü')) {
                return portugueseCommons.get(rdm.nextInt(portugueseCommons.size()));
            } else {
                return portugueseAlphabet.get(rdm.nextInt(portugueseAlphabet.size()));
            }
        } else if (langSelectorBox.equals("Russian")) {
            return russianAlphabet.get(rdm.nextInt(russianAlphabet.size()));
        } else if (langSelectorBox.equals("Arabic")) {
            return arabicAlphabet.get(rdm.nextInt(arabicAlphabet.size()));
        } else if (langSelectorBox.equals("Chinese")) {
            return chineseAlphabet.get(rdm.nextInt(chineseAlphabet.size()));
        } else if (langSelectorBox.equals("Japanese")) {
            return japaneseAlphabet.get(rdm.nextInt(japaneseAlphabet.size()));
        }
        else {
            return 'c';
        }
    }




}
