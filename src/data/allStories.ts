// ==========================================================================
// Adarsh's TextCraft & TypoLab Studio: Unified Master Story Provider
// Guarantees EXACTLY 5 Ultra-Long Hyper-Density Stories for Every Key & Mode
// ==========================================================================

import { ENGLISH_ALPHABET_DATA, TypingStory } from './storyDatabase';
import { HINDI_VOWEL_DATA } from './hindiStoryDatabase';
import { HINDI_CONSONANT_DATA, HINDI_MATRA_DATA } from './hindiConsonantsDatabase';
import {
  DUAL_PAIR_DATA,
  CASE_MASTERY_DATA,
  HARD_MODE_DATA,
  PRO_HARD_MODE_DATA,
  HINDI_LITERATURE_DATA,
  HINDI_PRO_HARD_DATA
} from './challengeStoryDatabase';
import { expandStoryTo15X, expandStorySetTo15Variations } from './storyExpander';
import { generateCustomDualPairStories } from './customDualPairEngine';

// Default custom presets if user hasn't pasted custom text yet
export const DEFAULT_CUSTOM_PRESETS: { title: string; subtitle: string; text: string; language: 'en' | 'hi' }[] = [
  {
    title: "The Art of Deliberate Focus & Deep Typing Flow",
    subtitle: "Custom Mode Preset 1 • English Flow Mastery",
    language: 'en',
    text: "True mastery in typing is born not from frantic velocity, but from deliberate cadence, calmness, and unwavering focus. When your fingers hover over the home row keys with gentle balance, each keystroke becomes an effortless extension of your thoughts. The rhythm of the mechanical switches echoes clarity, training your neural pathways to anticipate syllables, words, and complex punctuation without hesitation. As minutes turn into hours, the external noise dissolves, leaving only the pure resonance of prose appearing on the screen."
  },
  {
    title: "Silicon, Code, and the Infinite Digital Frontier",
    subtitle: "Custom Mode Preset 2 • Modern Tech & Programming Prose",
    language: 'en',
    text: "Beneath the glowing glass of modern interfaces lies a universe constructed from logic, syntax, and computational elegance. Algorithms traverse billions of instructions per second, weaving distributed networks, neural architectures, and real-time streams into seamless human experiences. To type code and prose with precision is to command this digital reality, transforming abstract thoughts into tangible software that connects continents, preserves knowledge, and pioneers new frontiers across science and art."
  },
  {
    title: "मुंशी प्रेमचंद: पंच परमेश्वर का शाश्वत संदेश",
    subtitle: "Custom Mode Preset 3 • हिन्दी साहित्य का अमर प्रसंग",
    language: 'hi',
    text: "पंच के दिल में खुदा बसता है। जब कोई मनुष्य न्याय के आसन पर बैठता है, तब वह किसी का मित्र या शत्रु नहीं रहता। उसके सामने केवल सत्य, न्याय और धर्म होता है। जुम्मन शेख और अलगू चौधरी की मित्रता वर्षों पुरानी थी, परंतु जब न्याय का अवसर आया, तब सत्य के पक्ष में दिया गया निर्णय मित्रता से कहीं अधिक महान सिद्ध हुआ। यही हमारी संस्कृति और न्यायप्रियता का मूल स्तंभ है कि सत्य की सदैव जय होती है।"
  },
  {
    title: "संत कबीर और रहीम के अनमोल प्रेरणादायी विचार",
    subtitle: "Custom Mode Preset 4 • ज्ञान, धैर्य और जीवन दर्शन",
    language: 'hi',
    text: "धीरे-धीरे रे मना, धीरे सब कुछ होय। माली सींचे सौ घड़ा, ऋतु आए फल होय। कबीरदास जी कहते हैं कि जीवन में धैर्य, निरंतर अभ्यास और निष्ठा से ही समस्त सिद्धियाँ प्राप्त होती हैं। जैसे समय आने पर ही वृक्ष में फल लगते हैं, वैसे ही लगातार कीबोर्ड पर उंगलियों के अभ्यास से टाइपिंग की गति और शुद्धता में अभूतपूर्व निपुणता आती है। वाणी में मधुरता और हृदय में सत्य का वास हो तो हर कठिन मार्ग सुगम बन जाता है।"
  },
  {
    title: "अंतरिक्ष अन्वेषण और ब्रह्मांड के असीम रहस्य",
    subtitle: "Custom Mode Preset 5 • विज्ञान और मानव चेतना की यात्रा",
    language: 'hi',
    text: "तारों से भरे नीले आकाश की ओर जब मानव दृष्टि जाती है, तब असीम जिज्ञासा और विस्मय का संचार होता है। हमारे वैज्ञानिक उपग्रह, अंतरिक्ष यान और दूरबीनें अरबों प्रकाश वर्ष दूर स्थित आकाशगंगाओं, कृष्ण विवरों और नवजात तारों का अध्ययन कर रहे हैं। विज्ञान केवल यंत्रों का नाम नहीं, बल्कि निरंतर सत्य की खोज और मानव जाति के कल्याण के लिए अदम्य साहस का प्रतीक है। जब हम नई तकनीकों और भाषाओं को सीखते हैं, तो हम अपनी चेतना का विस्तार करते हैं।"
  }
];

// In-memory caching layer for instant 0ms retrieval of 15 marathon variations
const marathonVariationCache = new Map<string, TypingStory[]>();

// Core helper to populate or fetch 15 marathon length endurance drill variations
export function fetchOrPopulate15MarathonVariations(
  language: 'en' | 'hi',
  category: string,
  key: string,
  customText?: string
): TypingStory[] {
  const cacheKey = `${language}-${category}-${key || 'default'}-${customText ? customText.length : 0}`;

  if (marathonVariationCache.has(cacheKey)) {
    return marathonVariationCache.get(cacheKey)!;
  }

  let rawList: TypingStory[] = [];

  if (category === 'custom') {
    // Custom Text Mode
    if (customText && customText.trim().length > 0) {
      const trimmed = customText.trim();
      const custom15 = Array.from({ length: 15 }, (_, idx) => ({
        id: `custom-user-${idx + 1}`,
        category: 'alphabet' as const,
        letter: 'Custom',
        language: language,
        title: `Your Custom Text (Marathon Drill Part ${idx + 1})`,
        subtitle: `User-Pasted Custom Typing Session • Part ${idx + 1}/15 • ${trimmed.length} characters`,
        text: trimmed,
        variationIndex: idx,
        totalVariations: 15,
        wordCount: Math.round(trimmed.split(/\s+/).length),
        characterCount: trimmed.length
      }));
      marathonVariationCache.set(cacheKey, custom15);
      return custom15;
    } else {
      rawList = DEFAULT_CUSTOM_PRESETS.map((preset, idx) => ({
        id: `custom-preset-${idx + 1}`,
        category: 'alphabet' as const,
        letter: 'Custom',
        language: preset.language,
        title: preset.title,
        subtitle: preset.subtitle,
        text: preset.text
      }));
      const expandedCustom = expandStorySetTo15Variations(rawList, 'Custom', language, 'custom');
      marathonVariationCache.set(cacheKey, expandedCustom);
      return expandedCustom;
    }
  }

  if (language === 'en') {
    if (category === 'alphabet') {
      const upperKey = (key || 'A').toUpperCase();
      const list = ENGLISH_ALPHABET_DATA[upperKey] || ENGLISH_ALPHABET_DATA['A'];
      rawList = list.map((item, idx) => ({
        id: `en-alpha-${upperKey.toLowerCase()}-${idx + 1}`,
        category: 'alphabet' as const,
        letter: upperKey,
        language: 'en' as const,
        title: item.title,
        subtitle: item.subtitle,
        text: item.text
      }));
    } else if (category === 'bigram') {
      const pairKey = (key || 'A+S').toUpperCase();
      if (pairKey.includes('+')) {
        const [l1, l2] = pairKey.split('+');
        if (l1 && l2) {
          if (DUAL_PAIR_DATA[pairKey]) {
            const list = DUAL_PAIR_DATA[pairKey];
            rawList = list.map((item, idx) => ({
              id: `en-bigram-${pairKey.replace('+', '')}-${idx + 1}`,
              category: 'bigram' as const,
              letter: pairKey,
              language: 'en' as const,
              title: item.title,
              subtitle: item.subtitle,
              text: item.text
            }));
          } else {
            const generatedPairs = generateCustomDualPairStories(l1, l2, 'en');
            marathonVariationCache.set(cacheKey, generatedPairs);
            return generatedPairs;
          }
        }
      }
      if (rawList.length === 0) {
        const list = DUAL_PAIR_DATA['A+S'];
        rawList = list.map((item, idx) => ({
          id: `en-bigram-as-${idx + 1}`,
          category: 'bigram' as const,
          letter: 'A+S',
          language: 'en' as const,
          title: item.title,
          subtitle: item.subtitle,
          text: item.text
        }));
      }
    } else if (category === 'case') {
      rawList = CASE_MASTERY_DATA.map((item, idx) => ({
        id: `en-case-${idx + 1}`,
        category: 'case' as const,
        letter: 'Shift',
        language: 'en' as const,
        title: item.title,
        subtitle: item.subtitle,
        text: item.text
      }));
    } else if (category === 'hard') {
      rawList = HARD_MODE_DATA.map((item, idx) => ({
        id: `en-hard-${idx + 1}`,
        category: 'hard' as const,
        letter: 'Syntax',
        language: 'en' as const,
        title: item.title,
        subtitle: item.subtitle,
        text: item.text
      }));
    } else if (category === 'pro-hard') {
      rawList = PRO_HARD_MODE_DATA.map((item, idx) => ({
        id: `en-prohard-${idx + 1}`,
        category: 'hard' as const,
        letter: 'Code',
        language: 'en' as const,
        title: item.title,
        subtitle: item.subtitle,
        text: item.text
      }));
    }
  } else {
    // Hindi categories
    if (category === 'vowel') {
      const vowelKey = key || 'अ';
      const list = HINDI_VOWEL_DATA[vowelKey] || HINDI_VOWEL_DATA['अ'];
      rawList = list.map((item, idx) => ({
        id: `hi-vowel-${idx + 1}`,
        category: 'vowel' as const,
        letter: vowelKey,
        language: 'hi' as const,
        title: item.title,
        subtitle: item.subtitle,
        text: item.text
      }));
    } else if (category === 'consonant') {
      const consKey = key || 'क';
      const list = HINDI_CONSONANT_DATA[consKey] || HINDI_CONSONANT_DATA['क'];
      rawList = list.map((item, idx) => ({
        id: `hi-cons-${idx + 1}`,
        category: 'consonant' as const,
        letter: consKey,
        language: 'hi' as const,
        title: item.title,
        subtitle: item.subtitle,
        text: item.text
      }));
    } else if (category === 'matra') {
      const matraKey = key || 'ा';
      const list = HINDI_MATRA_DATA[matraKey] || HINDI_MATRA_DATA['ा'];
      rawList = list.map((item, idx) => ({
        id: `hi-matra-${idx + 1}`,
        category: 'matra' as const,
        letter: matraKey,
        language: 'hi' as const,
        title: item.title,
        subtitle: item.subtitle,
        text: item.text
      }));
    } else if (category === 'literature') {
      rawList = HINDI_LITERATURE_DATA.map((item, idx) => ({
        id: `hi-lit-${idx + 1}`,
        category: 'literature' as const,
        letter: 'साहित्य',
        language: 'hi' as const,
        title: item.title,
        subtitle: item.subtitle,
        text: item.text
      }));
    } else if (category === 'hard') {
      rawList = HINDI_PRO_HARD_DATA.map((item, idx) => ({
        id: `hi-prohard-${idx + 1}`,
        category: 'hard' as const,
        letter: 'संयुक्त',
        language: 'hi' as const,
        title: item.title,
        subtitle: item.subtitle,
        text: item.text
      }));
    }
  }

  // Fallback if empty
  if (!rawList || rawList.length === 0) {
    rawList = ENGLISH_ALPHABET_DATA['A'].map((item, idx) => ({
      id: `en-fallback-${idx + 1}`,
      category: 'alphabet' as const,
      letter: 'A',
      language: 'en' as const,
      title: item.title,
      subtitle: item.subtitle,
      text: item.text
    }));
  }

  // Expand into 15 full, distinct variations per key
  const final15 = expandStorySetTo15Variations(rawList, key || 'A', language, category);
  marathonVariationCache.set(cacheKey, final15);
  return final15;
}

// Aliases for seamless backward compatibility & full 15-variation collection access
export const get15StoriesForKey = fetchOrPopulate15MarathonVariations;
export const getAllStoryVariations = fetchOrPopulate15MarathonVariations;

// Fetch exactly 5 primary marathon stories for backward compatibility
export function get5Stories(
  language: 'en' | 'hi',
  category: string,
  key: string,
  customText?: string
): TypingStory[] {
  const all15 = fetchOrPopulate15MarathonVariations(language, category, key, customText);
  return all15.slice(0, 5);
}
