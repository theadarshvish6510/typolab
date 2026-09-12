// ==========================================================================
// TypoLab Studio: Master Unified Story Aggregator & Export Router
// Unifies English A-Z, Devanagari स्वर/व्यंजन/मात्राएँ, Challenge modes,
// Dual-letter bigrams, and authentic literature excerpts.
// ==========================================================================

import { ENGLISH_ALPHABET_DATA, TypingStory } from './storyDatabase';
import { ENGLISH_EXPANDED_STORIES } from './storyExpanded';
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
import { DUAL_RULE_PAIRS } from './customRulePairEngine';
import { PREMCHAND_STORIES, KABIR_DOHA_STORIES, SPACE_SCIENCE_STORIES } from './storyBank';

export { DEFAULT_CUSTOM_PRESETS } from './allStories';

/**
 * Returns exactly 5 stories for any category, language, and selected key/mode
 */
export function get5Stories(
  language: 'en' | 'hi',
  category: string,
  selectedKey: string = 'A',
  customText?: string
): TypingStory[] {
  // 1. Custom User Text
  if (category === 'custom') {
    if (customText && customText.trim().length > 0) {
      const trimmed = customText.trim();
      return Array.from({ length: 5 }, (_, idx) => ({
        id: `custom-${idx + 1}`,
        category: 'custom' as any,
        letter: 'Custom',
        language,
        title: `Custom Drill (Session ${idx + 1}/5)`,
        subtitle: `User-provided text • ${trimmed.split(/\s+/).length} words`,
        text: trimmed,
        variationIndex: idx + 1,
        totalVariations: 5
      }));
    }
  }

  // 2. English Alphabet (A to Z) -> Use storyExpanded.ts marathon stories
  if (language === 'en' && category === 'alphabet') {
    const upper = (selectedKey || 'A').toUpperCase();
    const expanded = ENGLISH_EXPANDED_STORIES[upper];
    if (expanded && expanded.length >= 5) {
      return expanded.slice(0, 5).map((item, idx) => ({
        id: `en-exp-${upper}-${idx + 1}`,
        category: 'alphabet',
        letter: upper,
        language: 'en',
        title: item.title,
        subtitle: item.subtitle,
        text: item.text,
        variationIndex: idx + 1,
        totalVariations: 5
      }));
    }
    const fallback = ENGLISH_ALPHABET_DATA[upper] || ENGLISH_ALPHABET_DATA['A'];
    return fallback.slice(0, 5).map((item, idx) => ({
      id: `en-${upper}-${idx + 1}`,
      category: 'alphabet',
      letter: upper,
      language: 'en',
      title: item.title,
      subtitle: item.subtitle,
      text: item.text,
      variationIndex: idx + 1,
      totalVariations: 5
    }));
  }

  // 3. English Bigrams / Dual Pairs
  if (language === 'en' && (category === 'bigram' || selectedKey.includes('+'))) {
    const pair = selectedKey.toUpperCase();
    if (DUAL_RULE_PAIRS[pair]) {
      return DUAL_RULE_PAIRS[pair].stories.map((s, idx) => ({
        id: s.id,
        category: 'bigram',
        letter: pair,
        language: 'en',
        title: s.title,
        subtitle: s.subtitle,
        text: s.text,
        variationIndex: idx + 1,
        totalVariations: 5
      }));
    }
    if (DUAL_PAIR_DATA[pair]) {
      return DUAL_PAIR_DATA[pair].map((s, idx) => ({
        id: `pair-${pair}-${idx + 1}`,
        category: 'bigram',
        letter: pair,
        language: 'en',
        title: s.title,
        subtitle: s.subtitle,
        text: s.text,
        variationIndex: idx + 1,
        totalVariations: 5
      }));
    }
  }

  // 4. English Case Mastery
  if (language === 'en' && (category === 'case' || category === 'case-mastery')) {
    return CASE_MASTERY_DATA.map((s, idx) => ({
      id: `case-${idx + 1}`,
      category: 'case',
      letter: 'Shift',
      language: 'en',
      title: s.title,
      subtitle: s.subtitle,
      text: s.text,
      variationIndex: idx + 1,
      totalVariations: 5
    }));
  }

  // 5. English Hard / Pro-Hard
  if (language === 'en' && (category === 'hard' || category === 'pro-hard')) {
    const data = category === 'pro-hard' ? PRO_HARD_MODE_DATA : HARD_MODE_DATA;
    return data.map((s, idx) => ({
      id: `${category}-${idx + 1}`,
      category: category as any,
      letter: category === 'pro-hard' ? 'Code' : 'Hard',
      language: 'en',
      title: s.title,
      subtitle: s.subtitle,
      text: s.text,
      variationIndex: idx + 1,
      totalVariations: 5
    }));
  }

  // 6. Devanagari Swar (स्वर - Vowels)
  if (language === 'hi' && category === 'vowel') {
    const vowel = selectedKey || 'अ';
    const list = HINDI_VOWEL_DATA[vowel] || HINDI_VOWEL_DATA['अ'];
    return list.slice(0, 5).map((s, idx) => ({
      id: `hi-vowel-${vowel}-${idx + 1}`,
      category: 'vowel',
      letter: vowel,
      language: 'hi',
      title: s.title,
      subtitle: s.subtitle,
      text: s.text,
      variationIndex: idx + 1,
      totalVariations: 5
    }));
  }

  // 7. Devanagari Vyanjan (व्यंजन - Consonants)
  if (language === 'hi' && category === 'consonant') {
    const cons = selectedKey || 'क';
    const list = HINDI_CONSONANT_DATA[cons] || HINDI_CONSONANT_DATA['क'];
    return list.slice(0, 5).map((s, idx) => ({
      id: `hi-cons-${cons}-${idx + 1}`,
      category: 'consonant',
      letter: cons,
      language: 'hi',
      title: s.title,
      subtitle: s.subtitle,
      text: s.text,
      variationIndex: idx + 1,
      totalVariations: 5
    }));
  }

  // 8. Devanagari Matras (मात्राएँ)
  if (language === 'hi' && category === 'matra') {
    const matra = selectedKey || 'ा';
    const list = HINDI_MATRA_DATA[matra] || HINDI_MATRA_DATA['ा'];
    return list.slice(0, 5).map((s, idx) => ({
      id: `hi-matra-${idx + 1}`,
      category: 'matra',
      letter: matra,
      language: 'hi',
      title: s.title,
      subtitle: s.subtitle,
      text: s.text,
      variationIndex: idx + 1,
      totalVariations: 5
    }));
  }

  // 9. Authentic Literature Excerpts (Premchand, Kabir, Space Science)
  if (category === 'literature') {
    if (language === 'hi') {
      const combined = [...PREMCHAND_STORIES, ...KABIR_DOHA_STORIES];
      return combined.slice(0, 5).map((s, idx) => ({
        id: s.id,
        category: 'literature',
        letter: 'साहित्य',
        language: 'hi',
        title: s.title,
        subtitle: s.subtitle,
        text: s.text,
        variationIndex: idx + 1,
        totalVariations: 5
      }));
    } else {
      return SPACE_SCIENCE_STORIES.slice(0, 5).map((s, idx) => ({
        id: s.id,
        category: 'literature',
        letter: 'Science',
        language: 'en',
        title: s.title,
        subtitle: s.subtitle,
        text: s.text,
        variationIndex: idx + 1,
        totalVariations: 5
      }));
    }
  }

  // Fallback default
  const fallback = ENGLISH_EXPANDED_STORIES['A'] || ENGLISH_ALPHABET_DATA['A'];
  return fallback.slice(0, 5).map((item, idx) => ({
    id: `fallback-${idx + 1}`,
    category: 'alphabet',
    letter: 'A',
    language: 'en',
    title: item.title,
    subtitle: item.subtitle,
    text: item.text,
    variationIndex: idx + 1,
    totalVariations: 5
  }));
}
