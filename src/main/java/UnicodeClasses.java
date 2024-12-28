// Generated from UnicodeClasses.g4 by ANTLR 4.13.2

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class UnicodeClasses extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();
    public static final int
        UNICODE_CLASS_LL = 1, UNICODE_CLASS_LM = 2, UNICODE_CLASS_LO = 3, UNICODE_CLASS_LT = 4,
        UNICODE_CLASS_LU = 5, UNICODE_CLASS_ND = 6, UNICODE_CLASS_NL = 7;
    public static String[] channelNames = {
        "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
        "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
            "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", "UNICODE_CLASS_LT",
            "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
            null, "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", "UNICODE_CLASS_LT",
            "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }


    public UnicodeClasses(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "UnicodeClasses.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
        "\u0004\u0000\u0007\u001d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002" +
            "\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002" +
            "\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001" +
            "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001" +
            "\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001" +
            "\u0006\u0001\u0006\u0000\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003" +
            "\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u0001\u0000\u0007\u0246\u0000" +
            "az\u00b5\u00b5\u00df\u00f6\u00f8\u00ff\u0101\u0101\u0103\u0103\u0105\u0105" +
            "\u0107\u0107\u0109\u0109\u010b\u010b\u010d\u010d\u010f\u010f\u0111\u0111" +
            "\u0113\u0113\u0115\u0115\u0117\u0117\u0119\u0119\u011b\u011b\u011d\u011d" +
            "\u011f\u011f\u0121\u0121\u0123\u0123\u0125\u0125\u0127\u0127\u0129\u0129" +
            "\u012b\u012b\u012d\u012d\u012f\u012f\u0131\u0131\u0133\u0133\u0135\u0135" +
            "\u0137\u0138\u013a\u013a\u013c\u013c\u013e\u013e\u0140\u0140\u0142\u0142" +
            "\u0144\u0144\u0146\u0146\u0148\u0149\u014b\u014b\u014d\u014d\u014f\u014f" +
            "\u0151\u0151\u0153\u0153\u0155\u0155\u0157\u0157\u0159\u0159\u015b\u015b" +
            "\u015d\u015d\u015f\u015f\u0161\u0161\u0163\u0163\u0165\u0165\u0167\u0167" +
            "\u0169\u0169\u016b\u016b\u016d\u016d\u016f\u016f\u0171\u0171\u0173\u0173" +
            "\u0175\u0175\u0177\u0177\u017a\u017a\u017c\u017c\u017e\u0180\u0183\u0183" +
            "\u0185\u0185\u0188\u0188\u018c\u018d\u0192\u0192\u0195\u0195\u0199\u019b" +
            "\u019e\u019e\u01a1\u01a1\u01a3\u01a3\u01a5\u01a5\u01a8\u01a8\u01aa\u01ab" +
            "\u01ad\u01ad\u01b0\u01b0\u01b4\u01b4\u01b6\u01b6\u01b9\u01ba\u01bd\u01bf" +
            "\u01c6\u01c6\u01c9\u01c9\u01cc\u01cc\u01ce\u01ce\u01d0\u01d0\u01d2\u01d2" +
            "\u01d4\u01d4\u01d6\u01d6\u01d8\u01d8\u01da\u01da\u01dc\u01dd\u01df\u01df" +
            "\u01e1\u01e1\u01e3\u01e3\u01e5\u01e5\u01e7\u01e7\u01e9\u01e9\u01eb\u01eb" +
            "\u01ed\u01ed\u01ef\u01f0\u01f3\u01f3\u01f5\u01f5\u01f9\u01f9\u01fb\u01fb" +
            "\u01fd\u01fd\u01ff\u01ff\u0201\u0201\u0203\u0203\u0205\u0205\u0207\u0207" +
            "\u0209\u0209\u020b\u020b\u020d\u020d\u020f\u020f\u0211\u0211\u0213\u0213" +
            "\u0215\u0215\u0217\u0217\u0219\u0219\u021b\u021b\u021d\u021d\u021f\u021f" +
            "\u0221\u0221\u0223\u0223\u0225\u0225\u0227\u0227\u0229\u0229\u022b\u022b" +
            "\u022d\u022d\u022f\u022f\u0231\u0231\u0233\u0239\u023c\u023c\u023f\u0240" +
            "\u0242\u0242\u0247\u0247\u0249\u0249\u024b\u024b\u024d\u024d\u024f\u0293" +
            "\u0295\u02af\u0371\u0371\u0373\u0373\u0377\u0377\u037b\u037d\u0390\u0390" +
            "\u03ac\u03ce\u03d0\u03d1\u03d5\u03d7\u03d9\u03d9\u03db\u03db\u03dd\u03dd" +
            "\u03df\u03df\u03e1\u03e1\u03e3\u03e3\u03e5\u03e5\u03e7\u03e7\u03e9\u03e9" +
            "\u03eb\u03eb\u03ed\u03ed\u03ef\u03f3\u03f5\u03f5\u03f8\u03f8\u03fb\u03fc" +
            "\u0430\u045f\u0461\u0461\u0463\u0463\u0465\u0465\u0467\u0467\u0469\u0469" +
            "\u046b\u046b\u046d\u046d\u046f\u046f\u0471\u0471\u0473\u0473\u0475\u0475" +
            "\u0477\u0477\u0479\u0479\u047b\u047b\u047d\u047d\u047f\u047f\u0481\u0481" +
            "\u048b\u048b\u048d\u048d\u048f\u048f\u0491\u0491\u0493\u0493\u0495\u0495" +
            "\u0497\u0497\u0499\u0499\u049b\u049b\u049d\u049d\u049f\u049f\u04a1\u04a1" +
            "\u04a3\u04a3\u04a5\u04a5\u04a7\u04a7\u04a9\u04a9\u04ab\u04ab\u04ad\u04ad" +
            "\u04af\u04af\u04b1\u04b1\u04b3\u04b3\u04b5\u04b5\u04b7\u04b7\u04b9\u04b9" +
            "\u04bb\u04bb\u04bd\u04bd\u04bf\u04bf\u04c2\u04c2\u04c4\u04c4\u04c6\u04c6" +
            "\u04c8\u04c8\u04ca\u04ca\u04cc\u04cc\u04ce\u04cf\u04d1\u04d1\u04d3\u04d3" +
            "\u04d5\u04d5\u04d7\u04d7\u04d9\u04d9\u04db\u04db\u04dd\u04dd\u04df\u04df" +
            "\u04e1\u04e1\u04e3\u04e3\u04e5\u04e5\u04e7\u04e7\u04e9\u04e9\u04eb\u04eb" +
            "\u04ed\u04ed\u04ef\u04ef\u04f1\u04f1\u04f3\u04f3\u04f5\u04f5\u04f7\u04f7" +
            "\u04f9\u04f9\u04fb\u04fb\u04fd\u04fd\u04ff\u04ff\u0501\u0501\u0503\u0503" +
            "\u0505\u0505\u0507\u0507\u0509\u0509\u050b\u050b\u050d\u050d\u050f\u050f" +
            "\u0511\u0511\u0513\u0513\u0515\u0515\u0517\u0517\u0519\u0519\u051b\u051b" +
            "\u051d\u051d\u051f\u051f\u0521\u0521\u0523\u0523\u0525\u0525\u0527\u0527" +
            "\u0561\u0587\u1d00\u1d2b\u1d6b\u1d77\u1d79\u1d9a\u1e01\u1e01\u1e03\u1e03" +
            "\u1e05\u1e05\u1e07\u1e07\u1e09\u1e09\u1e0b\u1e0b\u1e0d\u1e0d\u1e0f\u1e0f" +
            "\u1e11\u1e11\u1e13\u1e13\u1e15\u1e15\u1e17\u1e17\u1e19\u1e19\u1e1b\u1e1b" +
            "\u1e1d\u1e1d\u1e1f\u1e1f\u1e21\u1e21\u1e23\u1e23\u1e25\u1e25\u1e27\u1e27" +
            "\u1e29\u1e29\u1e2b\u1e2b\u1e2d\u1e2d\u1e2f\u1e2f\u1e31\u1e31\u1e33\u1e33" +
            "\u1e35\u1e35\u1e37\u1e37\u1e39\u1e39\u1e3b\u1e3b\u1e3d\u1e3d\u1e3f\u1e3f" +
            "\u1e41\u1e41\u1e43\u1e43\u1e45\u1e45\u1e47\u1e47\u1e49\u1e49\u1e4b\u1e4b" +
            "\u1e4d\u1e4d\u1e4f\u1e4f\u1e51\u1e51\u1e53\u1e53\u1e55\u1e55\u1e57\u1e57" +
            "\u1e59\u1e59\u1e5b\u1e5b\u1e5d\u1e5d\u1e5f\u1e5f\u1e61\u1e61\u1e63\u1e63" +
            "\u1e65\u1e65\u1e67\u1e67\u1e69\u1e69\u1e6b\u1e6b\u1e6d\u1e6d\u1e6f\u1e6f" +
            "\u1e71\u1e71\u1e73\u1e73\u1e75\u1e75\u1e77\u1e77\u1e79\u1e79\u1e7b\u1e7b" +
            "\u1e7d\u1e7d\u1e7f\u1e7f\u1e81\u1e81\u1e83\u1e83\u1e85\u1e85\u1e87\u1e87" +
            "\u1e89\u1e89\u1e8b\u1e8b\u1e8d\u1e8d\u1e8f\u1e8f\u1e91\u1e91\u1e93\u1e93" +
            "\u1e95\u1e9d\u1e9f\u1e9f\u1ea1\u1ea1\u1ea3\u1ea3\u1ea5\u1ea5\u1ea7\u1ea7" +
            "\u1ea9\u1ea9\u1eab\u1eab\u1ead\u1ead\u1eaf\u1eaf\u1eb1\u1eb1\u1eb3\u1eb3" +
            "\u1eb5\u1eb5\u1eb7\u1eb7\u1eb9\u1eb9\u1ebb\u1ebb\u1ebd\u1ebd\u1ebf\u1ebf" +
            "\u1ec1\u1ec1\u1ec3\u1ec3\u1ec5\u1ec5\u1ec7\u1ec7\u1ec9\u1ec9\u1ecb\u1ecb" +
            "\u1ecd\u1ecd\u1ecf\u1ecf\u1ed1\u1ed1\u1ed3\u1ed3\u1ed5\u1ed5\u1ed7\u1ed7" +
            "\u1ed9\u1ed9\u1edb\u1edb\u1edd\u1edd\u1edf\u1edf\u1ee1\u1ee1\u1ee3\u1ee3" +
            "\u1ee5\u1ee5\u1ee7\u1ee7\u1ee9\u1ee9\u1eeb\u1eeb\u1eed\u1eed\u1eef\u1eef" +
            "\u1ef1\u1ef1\u1ef3\u1ef3\u1ef5\u1ef5\u1ef7\u1ef7\u1ef9\u1ef9\u1efb\u1efb" +
            "\u1efd\u1efd\u1eff\u1f07\u1f10\u1f15\u1f20\u1f27\u1f30\u1f37\u1f40\u1f45" +
            "\u1f50\u1f57\u1f60\u1f67\u1f70\u1f7d\u1f80\u1f87\u1f90\u1f97\u1fa0\u1fa7" +
            "\u1fb0\u1fb4\u1fb6\u1fb7\u1fbe\u1fbe\u1fc2\u1fc4\u1fc6\u1fc7\u1fd0\u1fd3" +
            "\u1fd6\u1fd7\u1fe0\u1fe7\u1ff2\u1ff4\u1ff6\u1ff7\u210a\u210a\u210e\u210f" +
            "\u2113\u2113\u212f\u212f\u2134\u2134\u2139\u2139\u213c\u213d\u2146\u2149" +
            "\u214e\u214e\u2184\u2184\u2c30\u2c5e\u2c61\u2c61\u2c65\u2c66\u2c68\u2c68" +
            "\u2c6a\u2c6a\u2c6c\u2c6c\u2c71\u2c71\u2c73\u2c74\u2c76\u2c7b\u2c81\u2c81" +
            "\u2c83\u2c83\u2c85\u2c85\u2c87\u2c87\u2c89\u2c89\u2c8b\u2c8b\u2c8d\u2c8d" +
            "\u2c8f\u2c8f\u2c91\u2c91\u2c93\u2c93\u2c95\u2c95\u2c97\u2c97\u2c99\u2c99" +
            "\u2c9b\u2c9b\u2c9d\u2c9d\u2c9f\u2c9f\u2ca1\u2ca1\u2ca3\u2ca3\u2ca5\u2ca5" +
            "\u2ca7\u2ca7\u2ca9\u2ca9\u2cab\u2cab\u2cad\u2cad\u2caf\u2caf\u2cb1\u2cb1" +
            "\u2cb3\u2cb3\u2cb5\u2cb5\u2cb7\u2cb7\u2cb9\u2cb9\u2cbb\u2cbb\u2cbd\u2cbd" +
            "\u2cbf\u2cbf\u2cc1\u2cc1\u2cc3\u2cc3\u2cc5\u2cc5\u2cc7\u2cc7\u2cc9\u2cc9" +
            "\u2ccb\u2ccb\u2ccd\u2ccd\u2ccf\u2ccf\u2cd1\u2cd1\u2cd3\u2cd3\u2cd5\u2cd5" +
            "\u2cd7\u2cd7\u2cd9\u2cd9\u2cdb\u2cdb\u2cdd\u2cdd\u2cdf\u2cdf\u2ce1\u2ce1" +
            "\u2ce3\u2ce4\u2cec\u2cec\u2cee\u2cee\u2cf3\u2cf3\u2d00\u2d25\u2d27\u2d27" +
            "\u2d2d\u2d2d\u8000\ua641\u8000\ua641\u8000\ua643\u8000\ua643\u8000\ua645" +
            "\u8000\ua645\u8000\ua647\u8000\ua647\u8000\ua649\u8000\ua649\u8000\ua64b" +
            "\u8000\ua64b\u8000\ua64d\u8000\ua64d\u8000\ua64f\u8000\ua64f\u8000\ua651" +
            "\u8000\ua651\u8000\ua653\u8000\ua653\u8000\ua655\u8000\ua655\u8000\ua657" +
            "\u8000\ua657\u8000\ua659\u8000\ua659\u8000\ua65b\u8000\ua65b\u8000\ua65d" +
            "\u8000\ua65d\u8000\ua65f\u8000\ua65f\u8000\ua661\u8000\ua661\u8000\ua663" +
            "\u8000\ua663\u8000\ua665\u8000\ua665\u8000\ua667\u8000\ua667\u8000\ua669" +
            "\u8000\ua669\u8000\ua66b\u8000\ua66b\u8000\ua66d\u8000\ua66d\u8000\ua681" +
            "\u8000\ua681\u8000\ua683\u8000\ua683\u8000\ua685\u8000\ua685\u8000\ua687" +
            "\u8000\ua687\u8000\ua689\u8000\ua689\u8000\ua68b\u8000\ua68b\u8000\ua68d" +
            "\u8000\ua68d\u8000\ua68f\u8000\ua68f\u8000\ua691\u8000\ua691\u8000\ua693" +
            "\u8000\ua693\u8000\ua695\u8000\ua695\u8000\ua697\u8000\ua697\u8000\ua723" +
            "\u8000\ua723\u8000\ua725\u8000\ua725\u8000\ua727\u8000\ua727\u8000\ua729" +
            "\u8000\ua729\u8000\ua72b\u8000\ua72b\u8000\ua72d\u8000\ua72d\u8000\ua72f" +
            "\u8000\ua731\u8000\ua733\u8000\ua733\u8000\ua735\u8000\ua735\u8000\ua737" +
            "\u8000\ua737\u8000\ua739\u8000\ua739\u8000\ua73b\u8000\ua73b\u8000\ua73d" +
            "\u8000\ua73d\u8000\ua73f\u8000\ua73f\u8000\ua741\u8000\ua741\u8000\ua743" +
            "\u8000\ua743\u8000\ua745\u8000\ua745\u8000\ua747\u8000\ua747\u8000\ua749" +
            "\u8000\ua749\u8000\ua74b\u8000\ua74b\u8000\ua74d\u8000\ua74d\u8000\ua74f" +
            "\u8000\ua74f\u8000\ua751\u8000\ua751\u8000\ua753\u8000\ua753\u8000\ua755" +
            "\u8000\ua755\u8000\ua757\u8000\ua757\u8000\ua759\u8000\ua759\u8000\ua75b" +
            "\u8000\ua75b\u8000\ua75d\u8000\ua75d\u8000\ua75f\u8000\ua75f\u8000\ua761" +
            "\u8000\ua761\u8000\ua763\u8000\ua763\u8000\ua765\u8000\ua765\u8000\ua767" +
            "\u8000\ua767\u8000\ua769\u8000\ua769\u8000\ua76b\u8000\ua76b\u8000\ua76d" +
            "\u8000\ua76d\u8000\ua76f\u8000\ua76f\u8000\ua771\u8000\ua778\u8000\ua77a" +
            "\u8000\ua77a\u8000\ua77c\u8000\ua77c\u8000\ua77f\u8000\ua77f\u8000\ua781" +
            "\u8000\ua781\u8000\ua783\u8000\ua783\u8000\ua785\u8000\ua785\u8000\ua787" +
            "\u8000\ua787\u8000\ua78c\u8000\ua78c\u8000\ua78e\u8000\ua78e\u8000\ua791" +
            "\u8000\ua791\u8000\ua793\u8000\ua793\u8000\ua7a1\u8000\ua7a1\u8000\ua7a3" +
            "\u8000\ua7a3\u8000\ua7a5\u8000\ua7a5\u8000\ua7a7\u8000\ua7a7\u8000\ua7a9" +
            "\u8000\ua7a9\u8000\ua7fa\u8000\ua7fa\u8000\ufb00\u8000\ufb06\u8000\ufb13" +
            "\u8000\ufb17\u8000\uff41\u8000\uff5a3\u0000\u02b0\u02c1\u02c6\u02d1\u02e0" +
            "\u02e4\u02ec\u02ec\u02ee\u02ee\u0374\u0374\u037a\u037a\u0559\u0559\u0640" +
            "\u0640\u06e5\u06e6\u07f4\u07f5\u07fa\u07fa\u081a\u081a\u0824\u0824\u0828" +
            "\u0828\u0971\u0971\u0e46\u0e46\u0ec6\u0ec6\u10fc\u10fc\u17d7\u17d7\u1843" +
            "\u1843\u1aa7\u1aa7\u1c78\u1c7d\u1d2c\u1d6a\u1d78\u1d78\u1d9b\u1dbf\u2071" +
            "\u2071\u207f\u207f\u2090\u209c\u2c7c\u2c7d\u2d6f\u2d6f\u2e2f\u2e2f\u3005" +
            "\u3005\u3031\u3035\u303b\u303b\u309d\u309e\u30fc\u30fe\u8000\ua015\u8000" +
            "\ua015\u8000\ua4f8\u8000\ua4fd\u8000\ua60c\u8000\ua60c\u8000\ua67f\u8000" +
            "\ua67f\u8000\ua717\u8000\ua71f\u8000\ua770\u8000\ua770\u8000\ua788\u8000" +
            "\ua788\u8000\ua7f8\u8000\ua7f9\u8000\ua9cf\u8000\ua9cf\u8000\uaa70\u8000" +
            "\uaa70\u8000\uaadd\u8000\uaadd\u8000\uaaf3\u8000\uaaf4\u8000\uff70\u8000" +
            "\uff70\u8000\uff9e\u8000\uff9f\u0121\u0000\u00aa\u00aa\u00ba\u00ba\u01bb" +
            "\u01bb\u01c0\u01c3\u0294\u0294\u05d0\u05ea\u05f0\u05f2\u0620\u063f\u0641" +
            "\u064a\u066e\u066f\u0671\u06d3\u06d5\u06d5\u06ee\u06ef\u06fa\u06fc\u06ff" +
            "\u06ff\u0710\u0710\u0712\u072f\u074d\u07a5\u07b1\u07b1\u07ca\u07ea\u0800" +
            "\u0815\u0840\u0858\u08a0\u08a0\u08a2\u08ac\u0904\u0939\u093d\u093d\u0950" +
            "\u0950\u0958\u0961\u0972\u0977\u0979\u097f\u0985\u098c\u098f\u0990\u0993" +
            "\u09a8\u09aa\u09b0\u09b2\u09b2\u09b6\u09b9\u09bd\u09bd\u09ce\u09ce\u09dc" +
            "\u09dd\u09df\u09e1\u09f0\u09f1\u0a05\u0a0a\u0a0f\u0a10\u0a13\u0a28\u0a2a" +
            "\u0a30\u0a32\u0a33\u0a35\u0a36\u0a38\u0a39\u0a59\u0a5c\u0a5e\u0a5e\u0a72" +
            "\u0a74\u0a85\u0a8d\u0a8f\u0a91\u0a93\u0aa8\u0aaa\u0ab0\u0ab2\u0ab3\u0ab5" +
            "\u0ab9\u0abd\u0abd\u0ad0\u0ad0\u0ae0\u0ae1\u0b05\u0b0c\u0b0f\u0b10\u0b13" +
            "\u0b28\u0b2a\u0b30\u0b32\u0b33\u0b35\u0b39\u0b3d\u0b3d\u0b5c\u0b5d\u0b5f" +
            "\u0b61\u0b71\u0b71\u0b83\u0b83\u0b85\u0b8a\u0b8e\u0b90\u0b92\u0b95\u0b99" +
            "\u0b9a\u0b9c\u0b9c\u0b9e\u0b9f\u0ba3\u0ba4\u0ba8\u0baa\u0bae\u0bb9\u0bd0" +
            "\u0bd0\u0c05\u0c0c\u0c0e\u0c10\u0c12\u0c28\u0c2a\u0c33\u0c35\u0c39\u0c3d" +
            "\u0c3d\u0c58\u0c59\u0c60\u0c61\u0c85\u0c8c\u0c8e\u0c90\u0c92\u0ca8\u0caa" +
            "\u0cb3\u0cb5\u0cb9\u0cbd\u0cbd\u0cde\u0cde\u0ce0\u0ce1\u0cf1\u0cf2\u0d05" +
            "\u0d0c\u0d0e\u0d10\u0d12\u0d3a\u0d3d\u0d3d\u0d4e\u0d4e\u0d60\u0d61\u0d7a" +
            "\u0d7f\u0d85\u0d96\u0d9a\u0db1\u0db3\u0dbb\u0dbd\u0dbd\u0dc0\u0dc6\u0e01" +
            "\u0e30\u0e32\u0e33\u0e40\u0e45\u0e81\u0e82\u0e84\u0e84\u0e87\u0e88\u0e8a" +
            "\u0e8a\u0e8d\u0e8d\u0e94\u0e97\u0e99\u0e9f\u0ea1\u0ea3\u0ea5\u0ea5\u0ea7" +
            "\u0ea7\u0eaa\u0eab\u0ead\u0eb0\u0eb2\u0eb3\u0ebd\u0ebd\u0ec0\u0ec4\u0edc" +
            "\u0edf\u0f00\u0f00\u0f40\u0f47\u0f49\u0f6c\u0f88\u0f8c\u1000\u102a\u103f" +
            "\u103f\u1050\u1055\u105a\u105d\u1061\u1061\u1065\u1066\u106e\u1070\u1075" +
            "\u1081\u108e\u108e\u10d0\u10fa\u10fd\u1248\u124a\u124d\u1250\u1256\u1258" +
            "\u1258\u125a\u125d\u1260\u1288\u128a\u128d\u1290\u12b0\u12b2\u12b5\u12b8" +
            "\u12be\u12c0\u12c0\u12c2\u12c5\u12c8\u12d6\u12d8\u1310\u1312\u1315\u1318" +
            "\u135a\u1380\u138f\u13a0\u13f4\u1401\u166c\u166f\u167f\u1681\u169a\u16a0" +
            "\u16ea\u1700\u170c\u170e\u1711\u1720\u1731\u1740\u1751\u1760\u176c\u176e" +
            "\u1770\u1780\u17b3\u17dc\u17dc\u1820\u1842\u1844\u1877\u1880\u18a8\u18aa" +
            "\u18aa\u18b0\u18f5\u1900\u191c\u1950\u196d\u1970\u1974\u1980\u19ab\u19c1" +
            "\u19c7\u1a00\u1a16\u1a20\u1a54\u1b05\u1b33\u1b45\u1b4b\u1b83\u1ba0\u1bae" +
            "\u1baf\u1bba\u1be5\u1c00\u1c23\u1c4d\u1c4f\u1c5a\u1c77\u1ce9\u1cec\u1cee" +
            "\u1cf1\u1cf5\u1cf6\u2135\u2138\u2d30\u2d67\u2d80\u2d96\u2da0\u2da6\u2da8" +
            "\u2dae\u2db0\u2db6\u2db8\u2dbe\u2dc0\u2dc6\u2dc8\u2dce\u2dd0\u2dd6\u2dd8" +
            "\u2dde\u3006\u3006\u303c\u303c\u3041\u3096\u309f\u309f\u30a1\u30fa\u30ff" +
            "\u30ff\u3105\u312d\u3131\u318e\u31a0\u31ba\u31f0\u31ff\u3400\u3400\u4db5" +
            "\u4db5\u4e00\u4e00\u8000\u9fcc\u8000\u9fcc\u8000\ua000\u8000\ua014\u8000" +
            "\ua016\u8000\ua48c\u8000\ua4d0\u8000\ua4f7\u8000\ua500\u8000\ua60b\u8000" +
            "\ua610\u8000\ua61f\u8000\ua62a\u8000\ua62b\u8000\ua66e\u8000\ua66e\u8000" +
            "\ua6a0\u8000\ua6e5\u8000\ua7fb\u8000\ua801\u8000\ua803\u8000\ua805\u8000" +
            "\ua807\u8000\ua80a\u8000\ua80c\u8000\ua822\u8000\ua840\u8000\ua873\u8000" +
            "\ua882\u8000\ua8b3\u8000\ua8f2\u8000\ua8f7\u8000\ua8fb\u8000\ua8fb\u8000" +
            "\ua90a\u8000\ua925\u8000\ua930\u8000\ua946\u8000\ua960\u8000\ua97c\u8000" +
            "\ua984\u8000\ua9b2\u8000\uaa00\u8000\uaa28\u8000\uaa40\u8000\uaa42\u8000" +
            "\uaa44\u8000\uaa4b\u8000\uaa60\u8000\uaa6f\u8000\uaa71\u8000\uaa76\u8000" +
            "\uaa7a\u8000\uaa7a\u8000\uaa80\u8000\uaaaf\u8000\uaab1\u8000\uaab1\u8000" +
            "\uaab5\u8000\uaab6\u8000\uaab9\u8000\uaabd\u8000\uaac0\u8000\uaac0\u8000" +
            "\uaac2\u8000\uaac2\u8000\uaadb\u8000\uaadc\u8000\uaae0\u8000\uaaea\u8000" +
            "\uaaf2\u8000\uaaf2\u8000\uab01\u8000\uab06\u8000\uab09\u8000\uab0e\u8000" +
            "\uab11\u8000\uab16\u8000\uab20\u8000\uab26\u8000\uab28\u8000\uab2e\u8000" +
            "\uabc0\u8000\uabe2\u8000\uac00\u8000\uac00\u8000\ud7a3\u8000\ud7a3\u8000" +
            "\ud7b0\u8000\ud7c6\u8000\ud7cb\u8000\ud7fb\u8000\uf900\u8000\ufa6d\u8000" +
            "\ufa70\u8000\ufad9\u8000\ufb1d\u8000\ufb1d\u8000\ufb1f\u8000\ufb28\u8000" +
            "\ufb2a\u8000\ufb36\u8000\ufb38\u8000\ufb3c\u8000\ufb3e\u8000\ufb3e\u8000" +
            "\ufb40\u8000\ufb41\u8000\ufb43\u8000\ufb44\u8000\ufb46\u8000\ufbb1\u8000" +
            "\ufbd3\u8000\ufd3d\u8000\ufd50\u8000\ufd8f\u8000\ufd92\u8000\ufdc7\u8000" +
            "\ufdf0\u8000\ufdfb\u8000\ufe70\u8000\ufe74\u8000\ufe76\u8000\ufefc\u8000" +
            "\uff66\u8000\uff6f\u8000\uff71\u8000\uff9d\u8000\uffa0\u8000\uffbe\u8000" +
            "\uffc2\u8000\uffc7\u8000\uffca\u8000\uffcf\u8000\uffd2\u8000\uffd7\u8000" +
            "\uffda\u8000\uffdc\n\u0000\u01c5\u01c5\u01c8\u01c8\u01cb\u01cb\u01f2\u01f2" +
            "\u1f88\u1f8f\u1f98\u1f9f\u1fa8\u1faf\u1fbc\u1fbc\u1fcc\u1fcc\u1ffc\u1ffc" +
            "\u0240\u0000AZ\u00c0\u00d6\u00d8\u00de\u0100\u0100\u0102\u0102\u0104\u0104" +
            "\u0106\u0106\u0108\u0108\u010a\u010a\u010c\u010c\u010e\u010e\u0110\u0110" +
            "\u0112\u0112\u0114\u0114\u0116\u0116\u0118\u0118\u011a\u011a\u011c\u011c" +
            "\u011e\u011e\u0120\u0120\u0122\u0122\u0124\u0124\u0126\u0126\u0128\u0128" +
            "\u012a\u012a\u012c\u012c\u012e\u012e\u0130\u0130\u0132\u0132\u0134\u0134" +
            "\u0136\u0136\u0139\u0139\u013b\u013b\u013d\u013d\u013f\u013f\u0141\u0141" +
            "\u0143\u0143\u0145\u0145\u0147\u0147\u014a\u014a\u014c\u014c\u014e\u014e" +
            "\u0150\u0150\u0152\u0152\u0154\u0154\u0156\u0156\u0158\u0158\u015a\u015a" +
            "\u015c\u015c\u015e\u015e\u0160\u0160\u0162\u0162\u0164\u0164\u0166\u0166" +
            "\u0168\u0168\u016a\u016a\u016c\u016c\u016e\u016e\u0170\u0170\u0172\u0172" +
            "\u0174\u0174\u0176\u0176\u0178\u0179\u017b\u017b\u017d\u017d\u0181\u0182" +
            "\u0184\u0184\u0186\u0187\u0189\u018b\u018e\u0191\u0193\u0194\u0196\u0198" +
            "\u019c\u019d\u019f\u01a0\u01a2\u01a2\u01a4\u01a4\u01a6\u01a7\u01a9\u01a9" +
            "\u01ac\u01ac\u01ae\u01af\u01b1\u01b3\u01b5\u01b5\u01b7\u01b8\u01bc\u01bc" +
            "\u01c4\u01c4\u01c7\u01c7\u01ca\u01ca\u01cd\u01cd\u01cf\u01cf\u01d1\u01d1" +
            "\u01d3\u01d3\u01d5\u01d5\u01d7\u01d7\u01d9\u01d9\u01db\u01db\u01de\u01de" +
            "\u01e0\u01e0\u01e2\u01e2\u01e4\u01e4\u01e6\u01e6\u01e8\u01e8\u01ea\u01ea" +
            "\u01ec\u01ec\u01ee\u01ee\u01f1\u01f1\u01f4\u01f4\u01f6\u01f8\u01fa\u01fa" +
            "\u01fc\u01fc\u01fe\u01fe\u0200\u0200\u0202\u0202\u0204\u0204\u0206\u0206" +
            "\u0208\u0208\u020a\u020a\u020c\u020c\u020e\u020e\u0210\u0210\u0212\u0212" +
            "\u0214\u0214\u0216\u0216\u0218\u0218\u021a\u021a\u021c\u021c\u021e\u021e" +
            "\u0220\u0220\u0222\u0222\u0224\u0224\u0226\u0226\u0228\u0228\u022a\u022a" +
            "\u022c\u022c\u022e\u022e\u0230\u0230\u0232\u0232\u023a\u023b\u023d\u023e" +
            "\u0241\u0241\u0243\u0246\u0248\u0248\u024a\u024a\u024c\u024c\u024e\u024e" +
            "\u0370\u0370\u0372\u0372\u0376\u0376\u0386\u0386\u0388\u038a\u038c\u038c" +
            "\u038e\u038f\u0391\u03a1\u03a3\u03ab\u03cf\u03cf\u03d2\u03d4\u03d8\u03d8" +
            "\u03da\u03da\u03dc\u03dc\u03de\u03de\u03e0\u03e0\u03e2\u03e2\u03e4\u03e4" +
            "\u03e6\u03e6\u03e8\u03e8\u03ea\u03ea\u03ec\u03ec\u03ee\u03ee\u03f4\u03f4" +
            "\u03f7\u03f7\u03f9\u03fa\u03fd\u042f\u0460\u0460\u0462\u0462\u0464\u0464" +
            "\u0466\u0466\u0468\u0468\u046a\u046a\u046c\u046c\u046e\u046e\u0470\u0470" +
            "\u0472\u0472\u0474\u0474\u0476\u0476\u0478\u0478\u047a\u047a\u047c\u047c" +
            "\u047e\u047e\u0480\u0480\u048a\u048a\u048c\u048c\u048e\u048e\u0490\u0490" +
            "\u0492\u0492\u0494\u0494\u0496\u0496\u0498\u0498\u049a\u049a\u049c\u049c" +
            "\u049e\u049e\u04a0\u04a0\u04a2\u04a2\u04a4\u04a4\u04a6\u04a6\u04a8\u04a8" +
            "\u04aa\u04aa\u04ac\u04ac\u04ae\u04ae\u04b0\u04b0\u04b2\u04b2\u04b4\u04b4" +
            "\u04b6\u04b6\u04b8\u04b8\u04ba\u04ba\u04bc\u04bc\u04be\u04be\u04c0\u04c1" +
            "\u04c3\u04c3\u04c5\u04c5\u04c7\u04c7\u04c9\u04c9\u04cb\u04cb\u04cd\u04cd" +
            "\u04d0\u04d0\u04d2\u04d2\u04d4\u04d4\u04d6\u04d6\u04d8\u04d8\u04da\u04da" +
            "\u04dc\u04dc\u04de\u04de\u04e0\u04e0\u04e2\u04e2\u04e4\u04e4\u04e6\u04e6" +
            "\u04e8\u04e8\u04ea\u04ea\u04ec\u04ec\u04ee\u04ee\u04f0\u04f0\u04f2\u04f2" +
            "\u04f4\u04f4\u04f6\u04f6\u04f8\u04f8\u04fa\u04fa\u04fc\u04fc\u04fe\u04fe" +
            "\u0500\u0500\u0502\u0502\u0504\u0504\u0506\u0506\u0508\u0508\u050a\u050a" +
            "\u050c\u050c\u050e\u050e\u0510\u0510\u0512\u0512\u0514\u0514\u0516\u0516" +
            "\u0518\u0518\u051a\u051a\u051c\u051c\u051e\u051e\u0520\u0520\u0522\u0522" +
            "\u0524\u0524\u0526\u0526\u0531\u0556\u10a0\u10c5\u10c7\u10c7\u10cd\u10cd" +
            "\u1e00\u1e00\u1e02\u1e02\u1e04\u1e04\u1e06\u1e06\u1e08\u1e08\u1e0a\u1e0a" +
            "\u1e0c\u1e0c\u1e0e\u1e0e\u1e10\u1e10\u1e12\u1e12\u1e14\u1e14\u1e16\u1e16" +
            "\u1e18\u1e18\u1e1a\u1e1a\u1e1c\u1e1c\u1e1e\u1e1e\u1e20\u1e20\u1e22\u1e22" +
            "\u1e24\u1e24\u1e26\u1e26\u1e28\u1e28\u1e2a\u1e2a\u1e2c\u1e2c\u1e2e\u1e2e" +
            "\u1e30\u1e30\u1e32\u1e32\u1e34\u1e34\u1e36\u1e36\u1e38\u1e38\u1e3a\u1e3a" +
            "\u1e3c\u1e3c\u1e3e\u1e3e\u1e40\u1e40\u1e42\u1e42\u1e44\u1e44\u1e46\u1e46" +
            "\u1e48\u1e48\u1e4a\u1e4a\u1e4c\u1e4c\u1e4e\u1e4e\u1e50\u1e50\u1e52\u1e52" +
            "\u1e54\u1e54\u1e56\u1e56\u1e58\u1e58\u1e5a\u1e5a\u1e5c\u1e5c\u1e5e\u1e5e" +
            "\u1e60\u1e60\u1e62\u1e62\u1e64\u1e64\u1e66\u1e66\u1e68\u1e68\u1e6a\u1e6a" +
            "\u1e6c\u1e6c\u1e6e\u1e6e\u1e70\u1e70\u1e72\u1e72\u1e74\u1e74\u1e76\u1e76" +
            "\u1e78\u1e78\u1e7a\u1e7a\u1e7c\u1e7c\u1e7e\u1e7e\u1e80\u1e80\u1e82\u1e82" +
            "\u1e84\u1e84\u1e86\u1e86\u1e88\u1e88\u1e8a\u1e8a\u1e8c\u1e8c\u1e8e\u1e8e" +
            "\u1e90\u1e90\u1e92\u1e92\u1e94\u1e94\u1e9e\u1e9e\u1ea0\u1ea0\u1ea2\u1ea2" +
            "\u1ea4\u1ea4\u1ea6\u1ea6\u1ea8\u1ea8\u1eaa\u1eaa\u1eac\u1eac\u1eae\u1eae" +
            "\u1eb0\u1eb0\u1eb2\u1eb2\u1eb4\u1eb4\u1eb6\u1eb6\u1eb8\u1eb8\u1eba\u1eba" +
            "\u1ebc\u1ebc\u1ebe\u1ebe\u1ec0\u1ec0\u1ec2\u1ec2\u1ec4\u1ec4\u1ec6\u1ec6" +
            "\u1ec8\u1ec8\u1eca\u1eca\u1ecc\u1ecc\u1ece\u1ece\u1ed0\u1ed0\u1ed2\u1ed2" +
            "\u1ed4\u1ed4\u1ed6\u1ed6\u1ed8\u1ed8\u1eda\u1eda\u1edc\u1edc\u1ede\u1ede" +
            "\u1ee0\u1ee0\u1ee2\u1ee2\u1ee4\u1ee4\u1ee6\u1ee6\u1ee8\u1ee8\u1eea\u1eea" +
            "\u1eec\u1eec\u1eee\u1eee\u1ef0\u1ef0\u1ef2\u1ef2\u1ef4\u1ef4\u1ef6\u1ef6" +
            "\u1ef8\u1ef8\u1efa\u1efa\u1efc\u1efc\u1efe\u1efe\u1f08\u1f0f\u1f18\u1f1d" +
            "\u1f28\u1f2f\u1f38\u1f3f\u1f48\u1f4d\u1f59\u1f59\u1f5b\u1f5b\u1f5d\u1f5d" +
            "\u1f5f\u1f5f\u1f68\u1f6f\u1fb8\u1fbb\u1fc8\u1fcb\u1fd8\u1fdb\u1fe8\u1fec" +
            "\u1ff8\u1ffb\u2102\u2102\u2107\u2107\u210b\u210d\u2110\u2112\u2115\u2115" +
            "\u2119\u211d\u2124\u2124\u2126\u2126\u2128\u2128\u212a\u212d\u2130\u2133" +
            "\u213e\u213f\u2145\u2145\u2183\u2183\u2c00\u2c2e\u2c60\u2c60\u2c62\u2c64" +
            "\u2c67\u2c67\u2c69\u2c69\u2c6b\u2c6b\u2c6d\u2c70\u2c72\u2c72\u2c75\u2c75" +
            "\u2c7e\u2c80\u2c82\u2c82\u2c84\u2c84\u2c86\u2c86\u2c88\u2c88\u2c8a\u2c8a" +
            "\u2c8c\u2c8c\u2c8e\u2c8e\u2c90\u2c90\u2c92\u2c92\u2c94\u2c94\u2c96\u2c96" +
            "\u2c98\u2c98\u2c9a\u2c9a\u2c9c\u2c9c\u2c9e\u2c9e\u2ca0\u2ca0\u2ca2\u2ca2" +
            "\u2ca4\u2ca4\u2ca6\u2ca6\u2ca8\u2ca8\u2caa\u2caa\u2cac\u2cac\u2cae\u2cae" +
            "\u2cb0\u2cb0\u2cb2\u2cb2\u2cb4\u2cb4\u2cb6\u2cb6\u2cb8\u2cb8\u2cba\u2cba" +
            "\u2cbc\u2cbc\u2cbe\u2cbe\u2cc0\u2cc0\u2cc2\u2cc2\u2cc4\u2cc4\u2cc6\u2cc6" +
            "\u2cc8\u2cc8\u2cca\u2cca\u2ccc\u2ccc\u2cce\u2cce\u2cd0\u2cd0\u2cd2\u2cd2" +
            "\u2cd4\u2cd4\u2cd6\u2cd6\u2cd8\u2cd8\u2cda\u2cda\u2cdc\u2cdc\u2cde\u2cde" +
            "\u2ce0\u2ce0\u2ce2\u2ce2\u2ceb\u2ceb\u2ced\u2ced\u2cf2\u2cf2\u8000\ua640" +
            "\u8000\ua640\u8000\ua642\u8000\ua642\u8000\ua644\u8000\ua644\u8000\ua646" +
            "\u8000\ua646\u8000\ua648\u8000\ua648\u8000\ua64a\u8000\ua64a\u8000\ua64c" +
            "\u8000\ua64c\u8000\ua64e\u8000\ua64e\u8000\ua650\u8000\ua650\u8000\ua652" +
            "\u8000\ua652\u8000\ua654\u8000\ua654\u8000\ua656\u8000\ua656\u8000\ua658" +
            "\u8000\ua658\u8000\ua65a\u8000\ua65a\u8000\ua65c\u8000\ua65c\u8000\ua65e" +
            "\u8000\ua65e\u8000\ua660\u8000\ua660\u8000\ua662\u8000\ua662\u8000\ua664" +
            "\u8000\ua664\u8000\ua666\u8000\ua666\u8000\ua668\u8000\ua668\u8000\ua66a" +
            "\u8000\ua66a\u8000\ua66c\u8000\ua66c\u8000\ua680\u8000\ua680\u8000\ua682" +
            "\u8000\ua682\u8000\ua684\u8000\ua684\u8000\ua686\u8000\ua686\u8000\ua688" +
            "\u8000\ua688\u8000\ua68a\u8000\ua68a\u8000\ua68c\u8000\ua68c\u8000\ua68e" +
            "\u8000\ua68e\u8000\ua690\u8000\ua690\u8000\ua692\u8000\ua692\u8000\ua694" +
            "\u8000\ua694\u8000\ua696\u8000\ua696\u8000\ua722\u8000\ua722\u8000\ua724" +
            "\u8000\ua724\u8000\ua726\u8000\ua726\u8000\ua728\u8000\ua728\u8000\ua72a" +
            "\u8000\ua72a\u8000\ua72c\u8000\ua72c\u8000\ua72e\u8000\ua72e\u8000\ua732" +
            "\u8000\ua732\u8000\ua734\u8000\ua734\u8000\ua736\u8000\ua736\u8000\ua738" +
            "\u8000\ua738\u8000\ua73a\u8000\ua73a\u8000\ua73c\u8000\ua73c\u8000\ua73e" +
            "\u8000\ua73e\u8000\ua740\u8000\ua740\u8000\ua742\u8000\ua742\u8000\ua744" +
            "\u8000\ua744\u8000\ua746\u8000\ua746\u8000\ua748\u8000\ua748\u8000\ua74a" +
            "\u8000\ua74a\u8000\ua74c\u8000\ua74c\u8000\ua74e\u8000\ua74e\u8000\ua750" +
            "\u8000\ua750\u8000\ua752\u8000\ua752\u8000\ua754\u8000\ua754\u8000\ua756" +
            "\u8000\ua756\u8000\ua758\u8000\ua758\u8000\ua75a\u8000\ua75a\u8000\ua75c" +
            "\u8000\ua75c\u8000\ua75e\u8000\ua75e\u8000\ua760\u8000\ua760\u8000\ua762" +
            "\u8000\ua762\u8000\ua764\u8000\ua764\u8000\ua766\u8000\ua766\u8000\ua768" +
            "\u8000\ua768\u8000\ua76a\u8000\ua76a\u8000\ua76c\u8000\ua76c\u8000\ua76e" +
            "\u8000\ua76e\u8000\ua779\u8000\ua779\u8000\ua77b\u8000\ua77b\u8000\ua77d" +
            "\u8000\ua77e\u8000\ua780\u8000\ua780\u8000\ua782\u8000\ua782\u8000\ua784" +
            "\u8000\ua784\u8000\ua786\u8000\ua786\u8000\ua78b\u8000\ua78b\u8000\ua78d" +
            "\u8000\ua78d\u8000\ua790\u8000\ua790\u8000\ua792\u8000\ua792\u8000\ua7a0" +
            "\u8000\ua7a0\u8000\ua7a2\u8000\ua7a2\u8000\ua7a4\u8000\ua7a4\u8000\ua7a6" +
            "\u8000\ua7a6\u8000\ua7a8\u8000\ua7a8\u8000\ua7aa\u8000\ua7aa\u8000\uff21" +
            "\u8000\uff3a#\u000009\u0660\u0669\u06f0\u06f9\u07c0\u07c9\u0966\u096f" +
            "\u09e6\u09ef\u0a66\u0a6f\u0ae6\u0aef\u0b66\u0b6f\u0be6\u0bef\u0c66\u0c6f" +
            "\u0ce6\u0cef\u0d66\u0d6f\u0e50\u0e59\u0ed0\u0ed9\u0f20\u0f29\u1040\u1049" +
            "\u1090\u1099\u17e0\u17e9\u1810\u1819\u1946\u194f\u19d0\u19d9\u1a80\u1a89" +
            "\u1a90\u1a99\u1b50\u1b59\u1bb0\u1bb9\u1c40\u1c49\u1c50\u1c59\u8000\ua620" +
            "\u8000\ua629\u8000\ua8d0\u8000\ua8d9\u8000\ua900\u8000\ua909\u8000\ua9d0" +
            "\u8000\ua9d9\u8000\uaa50\u8000\uaa59\u8000\uabf0\u8000\uabf9\u8000\uff10" +
            "\u8000\uff19\u0007\u0000\u16ee\u16f0\u2160\u2182\u2185\u2188\u3007\u3007" +
            "\u3021\u3029\u3038\u303a\u8000\ua6e6\u8000\ua6ef\u001c\u0000\u0001\u0001" +
            "\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001" +
            "\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000" +
            "\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000" +
            "\u0000\u0001\u000f\u0001\u0000\u0000\u0000\u0003\u0011\u0001\u0000\u0000" +
            "\u0000\u0005\u0013\u0001\u0000\u0000\u0000\u0007\u0015\u0001\u0000\u0000" +
            "\u0000\t\u0017\u0001\u0000\u0000\u0000\u000b\u0019\u0001\u0000\u0000\u0000" +
            "\r\u001b\u0001\u0000\u0000\u0000\u000f\u0010\u0007\u0000\u0000\u0000\u0010" +
            "\u0002\u0001\u0000\u0000\u0000\u0011\u0012\u0007\u0001\u0000\u0000\u0012" +
            "\u0004\u0001\u0000\u0000\u0000\u0013\u0014\u0007\u0002\u0000\u0000\u0014" +
            "\u0006\u0001\u0000\u0000\u0000\u0015\u0016\u0007\u0003\u0000\u0000\u0016" +
            "\b\u0001\u0000\u0000\u0000\u0017\u0018\u0007\u0004\u0000\u0000\u0018\n" +
            "\u0001\u0000\u0000\u0000\u0019\u001a\u0007\u0005\u0000\u0000\u001a\f\u0001" +
            "\u0000\u0000\u0000\u001b\u001c\u0007\u0006\u0000\u0000\u001c\u000e\u0001" +
            "\u0000\u0000\u0000\u0001\u0000\u0000";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}